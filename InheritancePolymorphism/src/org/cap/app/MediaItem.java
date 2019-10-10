package org.cap.app;

public class MediaItem extends Item
{
	 private int runtime;

	 public int getRuntime() {
	 	return runtime;
	 }

	 public void setRuntime(int runtime) {
	 	this.runtime = runtime;
	 }

	 @Override
	 public String toString() {
	 	return "MediaItem [runtime=" + runtime + "]";
	 }

	 @Override
	 public int getUniqueId() {
	 	// TODO Auto-generated method stub
	 	return super.getUniqueId();
	 }

	 @Override
	 public void setUniqueId(int uniqueId) {
	 	// TODO Auto-generated method stub
	 	super.setUniqueId(uniqueId);
	 }

	 @Override
	 public String getTitle() {
	 	// TODO Auto-generated method stub
	 	return super.getTitle();
	 }

	 @Override
	 public void setTitle(String title) {
	 	// TODO Auto-generated method stub
	 	super.setTitle(title);
	 }

	 @Override
	 public int getNoOfCopies() {
	 	// TODO Auto-generated method stub
	 	return super.getNoOfCopies();
	 }

	 @Override
	 public void setNoOfCopies(int noOfCopies) {
	 	// TODO Auto-generated method stub
	 	super.setNoOfCopies(noOfCopies);
	 }

}
