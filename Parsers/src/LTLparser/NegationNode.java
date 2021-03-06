package LTLparser;

import java.io.*;



public class NegationNode extends UnaryLTLNode {
    public NegationNode(LTLNode l1) {
        super(l1);
    }

    public void unparse(PrintWriter p, int indent) {
        p.print("(!");
        myLTL.unparse(p, 0);
        p.print(")");
    }

	@Override
	public void toString(StringBuilder s, int indent) {
		s.append("(!");
        myLTL.toString(s, 0);
        s.append(")");
	}
}
