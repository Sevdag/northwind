package kodlamaio.northwind.core.utilities.results;

public class ErrorDateResult<T> extends DataResult<T>{

	public ErrorDateResult(T data, String message) {
		super(data, false, message);
		
	}
	public ErrorDateResult(T data) {
		super(data, false);
		
	}
	
	public ErrorDateResult(String message) {
		super(null, false,message);
		
	}

}
