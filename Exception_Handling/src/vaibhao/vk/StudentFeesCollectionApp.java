package vaibhao.vk;

class StudentFeeException extends ArithmeticException {
	String feesError() {
		return "Deny Hall Ticket";
	}
}

class StudentFeesCollection {
	void verifyFees(int remFees) {
		if (remFees != 0) {
			StudentFeeException ex = new StudentFeeException();
			throw ex;
		} else {
			System.out.println("Allow for exam");
		}
	}
}

public class StudentFeesCollectionApp {
	public static void main(String x[]) {
		try {
			StudentFeesCollection sfc = new StudentFeesCollection();
			sfc.verifyFees(2000);
		} catch (StudentFeeException ex) {
			System.out.println("Error is " + ex.feesError());
		}
	}
}
