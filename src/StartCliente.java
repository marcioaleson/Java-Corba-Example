/**
 *
 * @author imed
 */
import org.omg.CORBA.ORB;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;

import DesimpenhoApp.Desimpenho;
import DesimpenhoApp.DesimpenhoHelper;

public class StartCliente {

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		try {
			ORB orb = ORB.init(args, null);
			org.omg.CORBA.Object objRef = orb
					.resolve_initial_references("NameService");
			NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
			Desimpenho addobj = (Desimpenho) DesimpenhoHelper.narrow(ncRef
					.resolve_str("ABC"));
			System.out.println("Teste de Desimpenho:");
			double r = addobj.desimpenho();
			System.out
					.println("Resultado da Contagem de 1 a 1000000 em segundos: "
							+ r);
			System.out.println("pausa...");
			System.in.read();
		} catch (Exception e) {
			System.out.println("Hello Client exception: " + e);
			e.printStackTrace();
		}

	}

}