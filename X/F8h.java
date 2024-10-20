package X;

import android.content.Intent;
import android.os.Bundle;

/* loaded from: F8h.class */
public final class F8h {
    public final Intent A00;

    public F8h(Class cls) {
        this.A00 = 4YU.A0A("com.facebook.fragment.FRAGMENT_ACTION").setClassName(cls.getPackage().getName(), cls.getName());
    }

    public static Intent A00(Bundle bundle, Class cls) {
        F8h f8h = new F8h(cls);
        f8h.A02(2130772018, 2130772020, 2130772018, 2130772020);
        f8h.A01();
        Intent intent = f8h.A00;
        intent.putExtras(bundle);
        return intent;
    }

    public void A01() {
        this.A00.putExtra("com.facebook.fragment.PUSH_BACK_STACK", true);
    }

    public void A02(int i, int i2, int i3, int i4) {
        Intent intent = this.A00;
        intent.putExtra("com.facebook.fragment.ENTER_ANIM", i);
        intent.putExtra("com.facebook.fragment.EXIT_ANIM", i2);
        intent.putExtra("com.facebook.fragment.POP_ENTER_ANIM", i3);
        intent.putExtra("com.facebook.fragment.POP_EXIT_ANIM", i4);
    }
}
