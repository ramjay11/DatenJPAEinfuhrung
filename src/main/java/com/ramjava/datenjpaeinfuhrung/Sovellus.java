package com.ramjava.datenjpaeinfuhrung;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ramjava.datenjpaeinfuhrung.config.AppConfig;
//import com.ramjava.datenjpaeinfuhrung.dao.OpiskelijaDAO;
import com.ramjava.datenjpaeinfuhrung.dao.OpiskelijaDAOImpl;
import com.ramjava.datenjpaeinfuhrung.entity.Opiskelija;

public class Sovellus {
	
    public static void main( String[] args ) {
    	// use AppConfig to create the container where bean and other configurations are defined
    	var container = new AnnotationConfigApplicationContext(AppConfig.class);
    	//container.register("");
    	//container.refresh();
    	//OpiskelijaDAO opiskelijaDAO = new OpiskelijaDAOImpl();
    	OpiskelijaDAOImpl opiskelijaDAO = container.getBean("opiskelijaDAOImpl", OpiskelijaDAOImpl.class);
        var huskey = new Opiskelija();
        huskey.setOpiskelijanNimi("Huskey Saint");
        huskey.setMobiili(123456);
        huskey.setOsoite("Pasig City");
        opiskelijaDAO.pelastaaOpiskelija(huskey);
    }
}
