package com.example.diogo;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import org.htmlunit.FailingHttpStatusCodeException;
import org.htmlunit.SilentCssErrorHandler;
import org.htmlunit.WebClient;
import org.htmlunit.html.DomElement;
import org.htmlunit.html.HtmlPage;
import org.htmlunit.html.HtmlTable;
import org.htmlunit.javascript.host.dom.NodeList;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws FailingHttpStatusCodeException, MalformedURLException, IOException {
        System.out.println("Hello World!");
        webScraping();
    }

    public static void webScraping() throws FailingHttpStatusCodeException, MalformedURLException, IOException {
        try(final WebClient webClient = new WebClient()){   
            //webClient.setCssErrorHandler(new SilentCssErrorHandler()); 
            webClient.getOptions().setThrowExceptionOnScriptError(false);  
            webClient.getOptions().setCssEnabled(false);
            webClient.getOptions().setJavaScriptEnabled(false);      
            HtmlPage page = webClient.getPage("https://news.ycombinator.com/");
            System.out.println("**************************");
            System.out.println("Executando: " + page.getTitleText());
            System.out.println("**************************");
            DomElement table = page.getElementById("hnmain");
            System.out.println("DOM: " + table.getBodi );
                
            
        }
        catch(Exception ex){
            System.out.println("ERRO === " + ex);
        }

    }

}
