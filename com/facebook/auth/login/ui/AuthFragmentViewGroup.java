package com.facebook.auth.login.ui;

import X.48A;
import X.F8h;
import X.GE4;
import android.content.Context;
import android.os.Bundle;

/* loaded from: AuthFragmentViewGroup.class */
public abstract class AuthFragmentViewGroup extends 48A {
    public final GE4 control;
    public final int mEnterTransitionAnimation;
    public final int mExitTransitionAnimation;
    public final int mPopEnterTransitionAnimation;
    public final int mPopExitTransitionAnimation;

    public AuthFragmentViewGroup(Context context, GE4 ge4) {
        super(context);
        this.control = ge4;
        this.mEnterTransitionAnimation = getResourceArgument("com.facebook.fragment.ENTER_ANIM", 0);
        this.mExitTransitionAnimation = getResourceArgument("com.facebook.fragment.EXIT_ANIM", 0);
        this.mPopEnterTransitionAnimation = getResourceArgument("com.facebook.fragment.POP_ENTER_ANIM", 0);
        this.mPopExitTransitionAnimation = getResourceArgument("com.facebook.fragment.POP_EXIT_ANIM", 0);
    }

    public Bundle getArguments() {
        return this.control.AnN().A00;
    }

    public int getResourceArgument(String str, int i) {
        int i2;
        Bundle arguments = getArguments();
        return (arguments == null || (i2 = arguments.getInt(str, i)) == 0) ? i : i2;
    }

    public void setCustomAnimations(F8h f8h) {
        f8h.A02(this.mEnterTransitionAnimation, this.mExitTransitionAnimation, this.mPopEnterTransitionAnimation, this.mPopExitTransitionAnimation);
    }
}
