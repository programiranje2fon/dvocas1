
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class PokreniTestove {

	public static void main(String[] args) {

		pokreniTestoveZaKlasu(zadatak1.TelevizorTest.class);
		
		pokreniTestoveZaKlasu(zadatak2.RadioTest.class);

	}

	@SuppressWarnings("rawtypes")
	private static void pokreniTestoveZaKlasu(Class c) {

		Result r = JUnitCore.runClasses(c);

		if (r.wasSuccessful()) {

			System.out.println("TEST KLASA: " + c.getName());
			System.out.println("	Pokrenuto testova: " + r.getRunCount() + "	Uspešnih testova: "
					+ (r.getRunCount() - r.getFailureCount()) + "	Neuspešnih testova: " + r.getFailureCount());
			System.out.println();

			System.out.println("	Svi testovi su uspešno prošli");
			System.out.println();
			System.out.flush();
		} else {
			System.err.println("TEST KLASA: " + c.getName());
			System.err.println("	Pokrenuto testova: " + r.getRunCount() + "	Uspešnih testova: "
					+ (r.getRunCount() - r.getFailureCount()) + "	Neuspešnih testova: " + r.getFailureCount());
			System.err.println();

			int i = 1;

			System.err.println("	Spisak NEUSPEŠNIH testova:");
			for (Failure failure : r.getFailures()) {
				if (failure.getException() instanceof NoClassDefFoundError)
					System.err.println("	" + i++ + ". U projektu ne postoji klasa " + failure.getException().getMessage().substring(1) + "\n		(proverite naziv klase i naziv paketa)\n");
					else
						if (failure.getException() instanceof NoSuchFieldError)
							System.err.println("	" + i++ + ". U projektu ne postoji atribut " + failure.getException().getMessage() + "\n		(proverite tip i naziv atributa)\n");
						else
							if (failure.getException() instanceof NoSuchMethodError)
								System.err.println("	" + i++ + ". U projektu ne postoji metoda " + failure.getException().getMessage() + "\n		 (proverite naziv metode, povratni tip, tipove i redosled parametara)\n");			
							else
								System.err.println("	" + i++ + ". " + failure.getTestHeader() + ": \n		" + failure.getMessage() + "\n");
			}

			System.err.println();
			System.err.flush();
		}

	}

}
