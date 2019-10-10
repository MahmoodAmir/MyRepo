package org.cap.app;

public class Video extends MediaItem
{
	private String director;
	private String genre;

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Video [director=" + director + ", genre=" + genre + "]";
	}

}
