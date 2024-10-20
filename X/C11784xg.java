package X;

import com.google.common.collect.ImmutableList;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.4xg, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4xg.class */
public final class C11784xg {
    public 5DI A00;
    public 5DI A01;
    public Integer A03;
    public Integer A04;
    public String A05;
    public Set A06 = new HashSet();
    public ImmutableList A02 = ImmutableList.of();

    public void A00(Integer num) {
        this.A03 = num;
        if (this.A06.contains("scope")) {
            return;
        }
        HashSet hashSet = new HashSet(this.A06);
        this.A06 = hashSet;
        hashSet.add("scope");
    }

    public void A01(Integer num) {
        this.A04 = num;
        if (this.A06.contains(Property.SYMBOL_Z_ORDER_SOURCE)) {
            return;
        }
        HashSet hashSet = new HashSet(this.A06);
        this.A06 = hashSet;
        hashSet.add(Property.SYMBOL_Z_ORDER_SOURCE);
    }
}
