interface Order
{
	void result(int price,String status);
}
public class PrintOrder {
	public static void main(String[] args) {
		Order MyOrder=(price,status)->{
			if(price>10000) {
				if(status=="ACCEPTED" || status=="COMPLETED")
				{
					System.out.println("Order Printed");
					System.out.println("----------------");
				}
			}
			else
			{
				System.out.println("Order is not printed");
				System.out.println("----------------");
			}
		};
		MyOrder.result(50000, "COMPLETED");
		MyOrder.result(5000, "COMPLETED");
		MyOrder.result(150, "ACCEPTED");
		MyOrder.result(15000, "ACCEPTED");

	}

	}


