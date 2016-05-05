package wellsfargo.com;

public class QuickPostBLL {
	
	public String Validate(Posting posting)
	{
		if(posting!=null)
		{
			if(posting.getEmail().isEmpty())
			{
				return "Please enter valid email";
			}
			else
			{
				return "Posting was Successful";
			}
		}
		else
		{
			return "Posting was unsuccessful";
		}
		
		
		
	}

}
