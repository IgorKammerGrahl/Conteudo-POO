package Eletronico;

public class HomeTheater {
	
	protected SistemaEletronico som;
	protected SistemaDeVideo video;
	
	public HomeTheater() {
		som = new SistemaEletronico();
		video = new SistemaDeVideo();
	}
	
	public SistemaEletronico getSom() {
		return som;
	}
	public void setSom(SistemaEletronico som) {
		this.som = som;
	}
	public SistemaDeVideo getVideo() {
		return video;
	}
	public void setVideo(SistemaDeVideo video) {
		this.video = video;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HomeTheater [som=");
		builder.append(som);
		builder.append(", video=");
		builder.append(video);
		builder.append("]");
		return builder.toString();
	}
	
}
