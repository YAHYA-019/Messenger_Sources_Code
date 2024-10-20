package com.google.common.collect;

/* loaded from: EmptyImmutableListMultimap.class */
public class EmptyImmutableListMultimap extends ImmutableListMultimap {
    public static final EmptyImmutableListMultimap A00 = new EmptyImmutableListMultimap();
    public static final long serialVersionUID = 0;

    public EmptyImmutableListMultimap() {
        super(RegularImmutableMap.A03, 0);
    }

    private Object readResolve() {
        return A00;
    }
}
