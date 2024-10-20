package com.fasterxml.jackson.databind.deser.impl;

import X.AbstractC01033pi;
import X.C27T;
import com.fasterxml.jackson.databind.JsonDeserializer;

/* loaded from: ErrorThrowingDeserializer.class */
public class ErrorThrowingDeserializer extends JsonDeserializer {
    public final Error A00;

    public ErrorThrowingDeserializer(NoClassDefFoundError noClassDefFoundError) {
        this.A00 = noClassDefFoundError;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
        throw this.A00;
    }
}
