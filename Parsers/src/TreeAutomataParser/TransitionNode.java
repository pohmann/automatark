package TreeAutomataParser;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

public class TransitionNode {

	public TransitionNode(String symbol, ArrayList<String> children, String finalState) {
		mySym = symbol;
		myChildren = children;
		myFinalState = finalState;
	}

	public void unparse(PrintWriter p) {
		p.print(mySym);

		// if no child
		if (myChildren == null) {
			p.print(" -> ");
			p.println(myFinalState);
			return;
		}

		// if children is not null
		p.print("(");
		Iterator<String> itr = myChildren.iterator();

		while (itr.hasNext()) { // print the rest of the list
			String s = itr.next();
			p.print(s);
			if (itr.hasNext()) {
				p.print(",");
			}
		}
		p.print(") -> ");
		p.println(myFinalState);
	}

	public void toString(StringBuilder s) {
		s.append(mySym);

		// if no child
		if (myChildren == null) {
			s.append(" -> ");
			s.append(myFinalState);
			s.append(System.getProperty("line.separator"));
			return;
		}

		// if children is not null
		s.append("(");
		Iterator<String> itr = myChildren.iterator();

		while (itr.hasNext()) { // print the rest of the list
			String str = itr.next();
			s.append(str);
			if (itr.hasNext()) {
				s.append(",");
			}
		}
		s.append(") -> ");
		s.append(myFinalState);
	}

	private String mySym;
	private ArrayList<String> myChildren;
	private String myFinalState;

}
