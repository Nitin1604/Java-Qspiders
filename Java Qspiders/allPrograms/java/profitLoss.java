import java.util.Scanner;
class profitLoss {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the cost price:");
		double costPrice = sc.nextDouble();
		System.out.println("Enter the selling price:");
		double sellingPrice = sc.nextDouble();
		checkProfitLoss(costPrice, sellingPrice);
	}
	public static void checkProfitLoss(double costPrice, double sellingPrice) {
		if(sellingPrice > costPrice){
			System.out.println("There is profit in transcation");
			double profit = sellingPrice - costPrice;
			double profitPerce = (profit*100)/costPrice;
			System.out.println("Profit percentage is: "+profitPerce);
		}
		else if(costPrice > sellingPrice){
			System.out.println("There is loss in the transcation");
			double loss = costPrice -sellingPrice;
			double lossPerce = (loss*100)/costPrice;
			System.out.println("Loss percentage is: "+lossPerce);
		}
		else
			System.out.println("There is no loss in the transcation");
	}
	
}