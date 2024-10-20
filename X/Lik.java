package X;

import android.content.ComponentName;

/* loaded from: Lik.class */
public final class Lik implements Comparable {
    public final ComponentName A00;
    public final 4iO A01;

    public Lik(ComponentName componentName, 4iO r303) {
        this.A01 = r303;
        this.A00 = componentName;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.A01.A02 - ((Lik) obj).A01.A02;
    }
}
