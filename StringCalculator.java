
public class StringCalculator {
	int totalCount = 0;
	public int Add(String numbers) throws Exception {
		GetCalledCount();
		if(numbers == null || "".equals(numbers)) {
			return 0;
		}
		int count = 0;
		String arr[] = numbers.split(",");
		for(String num : arr) {
			int number = Integer.parseInt(num);
			if(number < 0) {
				throw new Exception("negatives not allowed : "+ number);
			}
			if(number > 1000) {
				continue;
			}
			count += number;
		}
		return count;
	}
	
	public int GetCalledCount() {
		 return totalCount++;
	}
	
	public static void main(String[] args) {
		try {
			StringCalculator stringCltr = new StringCalculator();
			stringCltr.Add("");
		}catch(Exception e) {
			e.getStackTrace();
		}
	}

}
