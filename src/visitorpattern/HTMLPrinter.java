package visitorpattern;

public class HTMLPrinter
    implements ModemVisitor {
	public HTMLPrinter() {
	}

	// Imprimer un HayesModem en HTML
	public void visit(HayesModem modem) {
		System.out.println("Printing HTML Configuration for a Hayes Modem");
		System.out.println("<html><body>");
                System.out.println("Parameter p3 = " + modem.getParam3());
                System.out.println("</body></html>");
	}

	// Imprimer un ZoomModel en HTML
	public void visit(ZoomModem modem) {
		System.out.println("Printing HTML Configuration for a Zoom Modem");
		System.out.println("<html><body>");
                System.out.println("Parameter p4 = " + modem.getParam4());
                System.out.println("</body></html>");
	}

	// Imprimer un MyModem en HTML
	public void visit(MyModem modem) {
		System.out.println("Printing HTML Configuration for a My Modem");
		System.out.println("<html><body>");
                System.out.println("Parameter p1 = " + modem.getParam1());
                System.out.println("Parameter p2 = " + modem.getParam2());
                System.out.println("</body></html>");
	}
}
