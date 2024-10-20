package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.facebook.base.activity.FbFragmentActivity;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.IdentityHashMap;

/* renamed from: X.06u, reason: invalid class name */
/* loaded from: 06u.class */
public class C06u implements C1em, C00g, AnonymousClass025 {
    public FbFragmentActivity A00;
    public C06v A01;
    public final AnonymousClass074 A02 = new Object();

    public void A0P() {
        AnonymousClass074 anonymousClass074 = this.A02;
        synchronized (anonymousClass074) {
            IdentityHashMap identityHashMap = anonymousClass074.A00;
            if (identityHashMap != null) {
                identityHashMap.clear();
            }
        }
    }

    public void A0Q(FbFragmentActivity fbFragmentActivity, C06v c06v) {
        this.A00 = fbFragmentActivity;
        this.A01 = c06v;
    }

    public void A5D(1gM r302) {
        this.A01.A5D(r302);
    }

    public void AAx(Context context) {
        this.A01.AAx(context);
    }

    public void AGS() {
        this.A01.AGS();
    }

    public void AT5(Activity activity) {
        this.A01.AT5(activity);
    }

    public Object Ari(Class cls) {
        return cls.isInstance(this) ? this : this.A01.Ari(cls);
    }

    public LayoutInflater AtU() {
        return this.A01.AtU();
    }

    public MenuInflater Awc() {
        return this.A01.Awc();
    }

    public View B0T(int i) {
        return this.A01.B0T(i);
    }

    @Override // X.AnonymousClass025
    public Object B5M(Object obj) {
        return this.A02.A00(obj);
    }

    public Resources B7l() {
        return this.A01.B7l();
    }

    @Override // X.C1em, X.C06v
    public 06Z BDe() {
        return this.A01.BDe();
    }

    public Object BE6(String str) {
        return this.A01.BE6(str);
    }

    public View BJx(int i) {
        return this.A01.BJx(i);
    }

    public Window BKo() {
        return this.A01.BKo();
    }

    public boolean BMe(Throwable th) {
        return this.A01.BMe(th);
    }

    public boolean BNm() {
        return this.A01.BNm();
    }

    public boolean Bee(boolean z) {
        return this.A01.Bee(z);
    }

    public void Bhh(Bundle bundle) {
        this.A01.Bhh(bundle);
    }

    public void Bhl(Intent intent) {
        this.A01.Bhl(intent);
    }

    public void Bhn() {
        this.A01.Bhn();
    }

    public void BjK(Resources.Theme theme, int i, boolean z) {
        this.A01.BjK(theme, i, z);
    }

    public void Bjb(Fragment fragment) {
        this.A01.Bjb(fragment);
    }

    public void Bkf() {
        this.A01.Bkf();
    }

    public void Bl1(Bundle bundle) {
        this.A01.Bl1(bundle);
    }

    public void Bl3(Bundle bundle) {
        this.A01.Bl3(bundle);
    }

    public void BlM(Bundle bundle) {
        this.A01.BlM(bundle);
    }

    public boolean BrS(MenuItem menuItem) {
        return this.A01.BrS(menuItem);
    }

    public Dialog Brp(int i) {
        return this.A01.Brp(i);
    }

    public boolean Brv(Menu menu) {
        return this.A01.Brv(menu);
    }

    public void C82(boolean z) {
        this.A01.C82(z);
    }

    public void C8v(Intent intent) {
        this.A01.C8v(intent);
    }

    public boolean CAH(MenuItem menuItem) {
        return this.A01.CAH(menuItem);
    }

    public void CBj(boolean z, Configuration configuration) {
        this.A01.CBj(z, configuration);
    }

    public void CCw(Bundle bundle) {
        this.A01.CCw(bundle);
    }

    public void CD1() {
        this.A01.CD1();
    }

    public void CDI(int i, Dialog dialog) {
        this.A01.CDI(i, dialog);
    }

    public boolean CDS(Menu menu) {
        return this.A01.CDS(menu);
    }

    public void CH2(int i, String[] strArr, int[] iArr) {
        this.A01.CH2(i, strArr, iArr);
    }

    public void CHt() {
        this.A01.CHt();
    }

    public void CQk(CharSequence charSequence, int i) {
        this.A01.CQk(charSequence, i);
    }

    public void CTH() {
        this.A01.CTH();
    }

    public void CTK() {
        this.A01.CTK();
    }

    public void Cbh() {
        this.A01.Cbh();
    }

    public void CcH(1IG r302) {
        this.A01.CcH(r302);
    }

    public void Cdt(1gM r302) {
        this.A01.Cdt(r302);
    }

    public void CnO(int i) {
        this.A01.CnO(i);
    }

    public void CnP(View view) {
        this.A01.CnP(view);
    }

    public void Cq2(Intent intent) {
        this.A01.Cq2(intent);
    }

    @Override // X.AnonymousClass025
    public void CtX(Object obj, Object obj2) {
        this.A02.A01(obj, obj2);
    }

    public void Cu1(int i) {
        this.A01.Cu1(i);
    }

    public boolean CyH(03Y r302) {
        return this.A01.CyH(r302);
    }

    public void D1P(Intent intent) {
        this.A01.D1P(intent);
    }

    public void D1Q(Intent intent, Bundle bundle) {
        this.A01.D1Q(intent, bundle);
    }

    public void D1R(Intent intent, int i, Bundle bundle) {
        this.A01.D1R(intent, i, bundle);
    }

    @Override // X.C1em
    public void D3U() {
        this.A01.D3U();
    }

    public boolean D3g() {
        return this.A01.D3g();
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.A01.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.A01.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.A01.dispatchTouchEvent(motionEvent);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.A01.dump(str, fileDescriptor, printWriter, strArr);
    }

    public void finish() {
        this.A01.finish();
    }

    public Context getContext() {
        return this.A00;
    }

    public Intent getIntent() {
        return this.A01.getIntent();
    }

    public void onActivityDestroy() {
        this.A01.onActivityDestroy();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.A01.onActivityResult(i, i2, intent);
    }

    public void onAttachedToWindow() {
        this.A01.onAttachedToWindow();
    }

    public void onBackPressed() {
        this.A01.onBackPressed();
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.A01.onConfigurationChanged(configuration);
    }

    public void onContentChanged() {
        this.A01.onContentChanged();
    }

    public void onCreate(Bundle bundle) {
        this.A01.onCreate(bundle);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.A01.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public View onCreatePanelView(int i) {
        return this.A01.onCreatePanelView(i);
    }

    public void onDestroy() {
        this.A01.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.A01.onKeyDown(i, keyEvent);
    }

    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        return this.A01.onKeyLongPress(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.A01.onKeyUp(i, keyEvent);
    }

    public void onLowMemory() {
        this.A01.onLowMemory();
    }

    public void onPause() {
        this.A01.onPause();
    }

    public void onResume() {
        this.A01.onResume();
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.A01.onSaveInstanceState(bundle);
    }

    public boolean onSearchRequested() {
        return this.A01.onSearchRequested();
    }

    public void onStart() {
        this.A01.onStart();
    }

    public void onStop() {
        this.A01.onStop();
    }

    public void onTrimMemory(int i) {
        this.A01.onTrimMemory(i);
    }

    public void onWindowFocusChanged(boolean z) {
        this.A01.onWindowFocusChanged(z);
    }

    public void startActivityForResult(Intent intent, int i) {
        this.A01.startActivityForResult(intent, i);
    }
}
