package com.facebook.rtc.launch.model;

import X.11T;
import X.C1pq;
import X.Hej;

/* loaded from: CollisionContext.class */
public final class CollisionContext {
    public final String A00;
    public final String A01;
    public final String A02;

    public CollisionContext(Hej hej) {
        this.A00 = hej.A00;
        this.A01 = hej.A01;
        this.A02 = hej.A02;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CollisionContext)) {
                return false;
            }
            CollisionContext collisionContext = (CollisionContext) obj;
            if (!11T.A0O(this.A00, collisionContext.A00) || !11T.A0O(this.A01, collisionContext.A01) || !11T.A0O(this.A02, collisionContext.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00)));
    }
}
