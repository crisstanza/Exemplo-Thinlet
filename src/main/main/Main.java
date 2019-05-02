package main;

import thinlet.FrameLauncher;
import thinlet.Thinlet;

public final class Main extends Thinlet {

	private static final long serialVersionUID = 1L;

	public static final void main(final String[] args) throws Exception {
		new FrameLauncher("Exemplo Thinlet", new Main(), 480, 320);
	}

	public Main() throws Exception {
		super.add(super.parse(this.getClass().getSimpleName() + ".xml"));
		this.init();
	}

	public final void action() {
		System.out.println(this);
	}

	private final void init() {
		final Object servidor = super.find("servidor");
		super.setString(servidor, "text", "teste...");
	}

}
