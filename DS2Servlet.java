package it.usi.xframe.gec.ds2;

import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import it.usi.xframe.gec.holo.ImageResponse;
import it.usi.xframe.gec.pfstruts.utilities.GecWebConstants;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Implementazione della servlet per la gestione
 * della chiamata DS2
 * @author EE41538
 *
 */
public class DS2Servlet extends HttpServlet{
	
	

	private static final long serialVersionUID = -379658862649710757L;
	private static Log log = LogFactory.getLog(DS2Servlet.class);
	
	/** 
	 * Costruttore
	 */
	public DS2Servlet(){
		super();
	}
	
	/**
	 * Metodo di inizializzazione della Servlet
	 */
	public void init()throws ServletException{
		
		log.info("Init DS2 Servlet -  Start");
		
		// TODO Carica in sessione eventuali parametri se servono
	}
	/**
	 * Override del metodo doGet
	 */
	public  void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
						
		try{
			
			log.info("doGet() -- Start");
			
			// Tengo traccia del chiamente
			// ------------------------------------------------------------------------------------------>
			 Enumeration names = req.getHeaderNames();
			 while (names.hasMoreElements()) {
				 String name = (String) names.nextElement();
			      Enumeration values = req.getHeaders(name); 
			      if (values != null) {
			        while (values.hasMoreElements()) {
			          String value = (String) values.nextElement();
			          System.out.println(name + ": " + value);
			        }
			    }
			 }
			
			log.info("Request from....>> " + req.getRequestURL().toString());
			
			//
			// Tengo traccia dei parametri della chiamata
			// ------------------------------------------------------------------------------------------>
			StringBuffer sbRequest = new StringBuffer();
			Map reqParams =  req.getParameterMap();
			if(reqParams!=null && !reqParams.isEmpty() && reqParams.size()>0){
				
				for (Iterator it = reqParams.entrySet().iterator(); it.hasNext();) {
					
					Map.Entry pairs = (Map.Entry) it.next();				
					sbRequest.append(pairs.getKey().toString() + "=" + pairs.getValue().toString());
					sbRequest.append("&");
				}
				String requestParamsString = sbRequest.toString();
				log.info("Request parameters....>> " + sbRequest.toString());
			}
			
			 
			
			String queryString = "";
			StringBuffer sb = new StringBuffer();
			
			// Recupero dalla request, il flag di controllo che identifica 
			// la sezione di front-end chiamante
			// O = Mondo OLD (Debito OLD)
			// N = EuroSIG (Mondo new)			
			String fl_fe = req.getSession().getAttribute("FL_FE")!=null ?req.getSession().getAttribute("FL_FE").toString() : "" ;
			
			
			HashMap map = (HashMap) req.getSession().getAttribute("mapParameter");
			
			if(map!=null && map.size()>0){
				
				for (Iterator it = map.entrySet().iterator(); it.hasNext();) {
					Map.Entry pairs = (Map.Entry) it.next();
					
					sb.append(pairs.getKey().toString() + "=" + pairs.getValue().toString());
					sb.append("&");
				}
				
				queryString = sb.toString();
				if(queryString.endsWith("&")){
					queryString = queryString.substring(0,queryString.length()-1);
				}
			}
			
			// In funzione del flag indicate la sezione di front-end chiamante
			// Creo un dispacther opportuno.
			RequestDispatcher rp = null;
			
			if(fl_fe.equalsIgnoreCase("O")){
				rp = req.getRequestDispatcher(GecWebConstants.CARD_ISSUE +".do?" + queryString);/*method=retrieveAddData");*/
			}
			else if(fl_fe.equalsIgnoreCase("N")){
				rp = req.getRequestDispatcher(GecWebConstants.ESG_CARD_ISSUE_ADD_DATA + ".do?" + queryString);/*method=retrieveAddData");*/
			}
			else{
				// Sollevo eccezione e scrivo nei log che la variabile di controllo
				// ha assunto un valore non valido
				throw new Exception("DS2Servlet - No valid value for FL_FE field - FL_FE >> " + fl_fe);
			}
						
			
			if(rp!=null){						

				// Disabilita la chiamata a DS2
				// ----------------------------------------------------------------------->
				req.getSession().setAttribute("disableDs2Call","true");
				
				// pulisco la sessione dalla flag di controllo sulla variabile Flfg Frontend
				// ----------------------------------------------------------------------->
				req.getSession().setAttribute("FL_FE","");
				rp.forward(req, resp);
			}
			   
			
			log.info("doGet() -- End");
			
		}
		catch(Exception ex){
						
			log.info(ex.getMessage());
		}
	}
	
	
}
