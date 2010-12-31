package smalltalk.clientNamespace;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Html;
import org.zkoss.zul.Label;

public class Sample1Ctrl extends GenericForwardComposer{

	private Html htmlComp;
	
	public void doAfterCompose(Component win) throws Exception {
		Label label = (Label) win.getFellow("setByCtrl");
		label.setWidgetListener("onClick", "this.setValue('onClick handler from java');");

		Label label2 = (Label) win.getFellow("setByCtrl2");
		label2.setWidgetOverride("setValue", "function (value) {this.$setValue('overloaded setValue');}");
	}
	
	public void onUser$htmlComp(Event event){
		System.out.println("onUser get in server");
	}
}
