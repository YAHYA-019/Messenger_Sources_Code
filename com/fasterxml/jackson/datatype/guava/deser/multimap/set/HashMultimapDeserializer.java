package com.fasterxml.jackson.datatype.guava.deser.multimap.set;

import X.1Mu;
import X.C42o;
import X.C4E7;
import X.C68e;
import X.KnN;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.multimap.GuavaMultimapDeserializer;
import com.google.common.collect.HashMultimap;
import java.lang.reflect.Method;

/* loaded from: HashMultimapDeserializer.class */
public class HashMultimapDeserializer extends GuavaMultimapDeserializer {
    public static final long serialVersionUID = 1;

    @Override // com.fasterxml.jackson.datatype.guava.deser.multimap.GuavaMultimapDeserializer
    public JsonDeserializer A12(JsonDeserializer jsonDeserializer, KnN knN, C42o c42o, C68e c68e, C4E7 c4e7, Method method) {
        return new GuavaMultimapDeserializer(jsonDeserializer, knN, c42o, c68e, c4e7, method);
    }

    @Override // com.fasterxml.jackson.datatype.guava.deser.multimap.GuavaMultimapDeserializer
    public /* bridge */ /* synthetic */ 1Mu A13() {
        return new HashMultimap();
    }
}
