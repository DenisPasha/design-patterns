package org.example.behavioral.visitor;

import org.example.behavioral.visitor.dto.Liquor;
import org.example.behavioral.visitor.dto.Necessity;
import org.example.behavioral.visitor.dto.Tobacco;

public interface Visitor {
    double visit(Liquor liquor);
    double visit(Necessity necessity);
    double visit(Tobacco tobacco);
}
