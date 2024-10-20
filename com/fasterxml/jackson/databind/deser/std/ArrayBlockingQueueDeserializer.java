package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC01033pi;
import X.AnonymousClass001;
import X.C27T;
import java.util.Collection;
import java.util.concurrent.ArrayBlockingQueue;

/* loaded from: ArrayBlockingQueueDeserializer.class */
public class ArrayBlockingQueueDeserializer extends CollectionDeserializer {
    public static final long serialVersionUID = 1;

    @Override // com.fasterxml.jackson.databind.deser.std.CollectionDeserializer
    public Collection A12(AbstractC01033pi abstractC01033pi, C27T c27t, Collection collection) {
        if (collection == null) {
            collection = AnonymousClass001.A0s();
        }
        super.A12(abstractC01033pi, c27t, collection);
        return collection.isEmpty() ? new ArrayBlockingQueue(1, false) : new ArrayBlockingQueue(collection.size(), false, collection);
    }
}
