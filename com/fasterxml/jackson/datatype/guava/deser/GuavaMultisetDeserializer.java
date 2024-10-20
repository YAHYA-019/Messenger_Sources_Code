package com.fasterxml.jackson.datatype.guava.deser;

import X.AbstractC10624u0;
import X.C4u1;
import com.google.common.collect.NaturalOrdering;
import com.google.common.collect.TreeMultiset;

/* loaded from: GuavaMultisetDeserializer.class */
public abstract class GuavaMultisetDeserializer extends GuavaCollectionDeserializer {
    public static final long serialVersionUID = 1;

    /* JADX WARN: Type inference failed for: r0v12, types: [X.4u0, X.4u1, com.google.common.collect.AbstractMapBasedMultiset] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.4u0, X.4u1, com.google.common.collect.AbstractMapBasedMultiset] */
    public C4u1 A13() {
        if (this instanceof TreeMultisetDeserializer) {
            return new TreeMultiset(NaturalOrdering.A02);
        }
        if (this instanceof LinkedHashMultisetDeserializer) {
            ?? abstractC10624u0 = new AbstractC10624u0();
            abstractC10624u0.A01 = abstractC10624u0.A09();
            return abstractC10624u0;
        }
        ?? abstractC10624u02 = new AbstractC10624u0();
        abstractC10624u02.A01 = abstractC10624u02.A09();
        return abstractC10624u02;
    }
}
