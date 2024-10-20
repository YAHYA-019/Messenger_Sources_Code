package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;

/* renamed from: X.JhE, reason: case insensitive filesystem */
/* loaded from: JhE.class */
public final class C3045JhE extends L94 {
    public Intent A00;
    public String A01;

    @Override // X.L94
    public void A04(Context context, AttributeSet attributeSet) {
        super.A04(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, KcT.A00);
        11T.A0A(obtainAttributes);
        String string = obtainAttributes.getString(4);
        String A0s = string != null ? JR1.A0s(context, string) : null;
        Intent intent = this.A00;
        if (intent == null) {
            intent = AbF.A05();
            this.A00 = intent;
        }
        intent.setPackage(A0s);
        String string2 = obtainAttributes.getString(0);
        if (string2 != null) {
            if (string2.charAt(0) == '.') {
                string2 = 0Pz.A0W(context.getPackageName(), string2);
            }
            ComponentName componentName = new ComponentName(context, string2);
            Intent intent2 = this.A00;
            if (intent2 == null) {
                intent2 = AbF.A05();
                this.A00 = intent2;
            }
            intent2.setComponent(componentName);
        }
        String string3 = obtainAttributes.getString(1);
        Intent intent3 = this.A00;
        if (intent3 == null) {
            intent3 = AbF.A05();
            this.A00 = intent3;
        }
        intent3.setAction(string3);
        String string4 = obtainAttributes.getString(2);
        if (string4 != null) {
            Uri parse = Uri.parse(JR1.A0s(context, string4));
            Intent intent4 = this.A00;
            if (intent4 == null) {
                intent4 = AbF.A05();
                this.A00 = intent4;
            }
            intent4.setData(parse);
        }
        String string5 = obtainAttributes.getString(3);
        this.A01 = string5 != null ? JR1.A0s(context, string5) : null;
        obtainAttributes.recycle();
    }

    @Override // X.L94
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !(obj instanceof C3045JhE) || !super.equals(obj)) {
                return false;
            }
            Intent intent = this.A00;
            C3045JhE c3045JhE = (C3045JhE) obj;
            Intent intent2 = c3045JhE.A00;
            if (intent != null) {
                if (!intent.filterEquals(intent2)) {
                    return false;
                }
            } else if (intent2 != null) {
                return false;
            }
            if (!11T.A0O(this.A01, c3045JhE.A01)) {
                return false;
            }
        }
        return true;
    }

    @Override // X.L94
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        Intent intent = this.A00;
        int i = 0;
        int filterHashCode = (hashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
        String str = this.A01;
        if (str != null) {
            i = str.hashCode();
        }
        return filterHashCode + i;
    }

    @Override // X.L94
    public String toString() {
        String action;
        Intent intent = this.A00;
        ComponentName component = intent != null ? intent.getComponent() : null;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(super.toString());
        if (component == null) {
            Intent intent2 = this.A00;
            if (intent2 != null) {
                action = intent2.getAction();
                if (action != null) {
                    A0k.append(" action=");
                }
            }
            return 11T.A02(A0k);
        }
        A0k.append(" class=");
        action = component.getClassName();
        A0k.append(action);
        return 11T.A02(A0k);
    }
}
