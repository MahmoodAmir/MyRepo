package org.cap.app;

public class Cd extends MediaItem
{
	private String artist;
	private String genre;

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Cd [artist=" + artist + ", genre=" + genre + "]";
	}

	@Override
	public int getRuntime() {
		// TODO Auto-generated method stub
		return super.getRuntime();
	}

	@Override
	public void setRuntime(int runtime) {
		// TODO Auto-generated method stub
		super.setRuntime(runtime);
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
