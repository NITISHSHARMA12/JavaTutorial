/*interface*/
interface PrintMedia{
	void publishNews();
}
interface SocialMedia{
	void updateStatus();
}
class Internet implements PrintMedia,SocialMedia{
	public void publishNews(){
		System.out.println("news are published");
	}

	public void updateStatus(){
		System.out.println("new status updated");
	}

}
class Test{
	public static void main(String args[]){
		Internet internet =new Internet();
		internet.publishNews();
		internet.updateStatus();
	}
}