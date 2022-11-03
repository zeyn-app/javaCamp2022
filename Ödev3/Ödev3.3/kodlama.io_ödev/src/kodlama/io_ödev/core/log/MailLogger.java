package kodlama.io_ödev.core.log;

public class MailLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println(data + " logged to mail address.");
	}

}
