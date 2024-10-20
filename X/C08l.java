package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.08l, reason: invalid class name */
/* loaded from: 08l.class */
public abstract class C08l extends C08m {
    public final 0QO A01 = new 0QO(0);
    public final ArrayList A00 = new ArrayList();

    public C08l(C08j... c08jArr) {
        int length = c08jArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            C08j c08j = c08jArr[i2];
            Iterator it = c08j.Ara().iterator();
            while (it.hasNext()) {
                IntentFilter intentFilter = (IntentFilter) it.next();
                this.A00.add(intentFilter);
                int countActions = intentFilter.countActions();
                int i3 = 0;
                while (true) {
                    int i4 = i3;
                    if (i4 < countActions) {
                        String action = intentFilter.getAction(i4);
                        0QO r0 = this.A01;
                        action.getClass();
                        r0.put(action, c08j);
                        i3 = i4 + 1;
                    }
                }
            }
            i = i2 + 1;
        }
    }

    @Override // X.C08m
    public Object A00(String str) {
        Object obj = this.A01.get(str);
        obj.getClass();
        return obj;
    }

    public abstract Integer A02();

    @Override // X.C08m, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i;
        int A01 = 0FI.A01(1837733310);
        String action = intent.getAction();
        action.getClass();
        C08j c08j = (C08j) A00(action);
        if (c08j != null) {
            try {
                super.onReceive(context, intent);
                c08j.CFb(context, intent, this);
                C09m.A00.A00(intent, A01(context), null, "allow");
            } catch (SecurityException e) {
                C09m.A00.A00(intent, A01(context), null, "deny");
                i = -880590552;
                if (e instanceof 0LR) {
                    0FI.A0D(-1748760256, A01, intent);
                    throw e;
                }
            }
        }
        i = -559286012;
        0FI.A0D(i, A01, intent);
    }
}
