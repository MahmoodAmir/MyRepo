package org.cap.app;

public  abstract class Item 
{
	 private int uniqueId;
	    private String title;
	    private int noOfCopies;
		public int getUniqueId() {
			return uniqueId;
		}
		public void setUniqueId(int uniqueId) {
			this.uniqueId = uniqueId;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public int getNoOfCopies() {
			return noOfCopies;
		}
		public void setNoOfCopies(int noOfCopies) {
			this.noOfCopies = noOfCopies;
		}
		@Override
		public String toString() {
			return "Item [uniqueId=" + uniqueId + ", title=" + title + ", noOfCopies=" + noOfCopies + "]";
		}
	    public Item() 
	    {
	    	System.out.println("This is default constructor");
	    }
	    public Item(int uniqueId, String title, int noOfCopies)
	    {
	    	this.uniqueId=uniqueId;
	    	this.title=title;
	    	this.noOfCopies=noOfCopies;
	    			
	    }
		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			return super.equals(obj);
		
	    
	}
}
