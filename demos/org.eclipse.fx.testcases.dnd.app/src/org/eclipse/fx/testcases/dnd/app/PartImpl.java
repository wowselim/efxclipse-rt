package org.eclipse.fx.testcases.dnd.app;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;

import javax.annotation.PostConstruct;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;

public class PartImpl {
	private TextField f;

	@PostConstruct
	void init(BorderPane parent, MPart part) {
		Label l = new Label(part.getLabel());
		l.setFont(Font.font(30));
		
		parent.setCenter(l);
		
		f = new TextField();
		parent.setBottom(f);
	}
	
	@Focus
	void focus() {
		f.requestFocus();
	}
}
