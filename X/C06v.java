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
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: X.06v, reason: invalid class name */
/* loaded from: 06v.class */
public interface C06v extends C1en {
    void AAx(Context context);

    void AGS();

    void AT5(Activity activity);

    Object Ari(Class cls);

    LayoutInflater AtU();

    MenuInflater Awc();

    View B0T(int i);

    Resources B7l();

    06Z BDe();

    Object BE6(String str);

    View BJx(int i);

    Window BKo();

    boolean BMe(Throwable th);

    boolean BNm();

    boolean Bee(boolean z);

    void Bhh(Bundle bundle);

    void Bhl(Intent intent);

    void Bhn();

    void BjK(Resources.Theme theme, int i, boolean z);

    void Bjb(Fragment fragment);

    void Bkf();

    void Bl1(Bundle bundle);

    void Bl3(Bundle bundle);

    void BlM(Bundle bundle);

    boolean BrS(MenuItem menuItem);

    Dialog Brp(int i);

    boolean Brv(Menu menu);

    void C82(boolean z);

    void C8v(Intent intent);

    boolean CAH(MenuItem menuItem);

    void CBj(boolean z, Configuration configuration);

    void CCw(Bundle bundle);

    void CD1();

    void CDI(int i, Dialog dialog);

    boolean CDS(Menu menu);

    void CH2(int i, String[] strArr, int[] iArr);

    void CHt();

    void CQk(CharSequence charSequence, int i);

    void CTH();

    void CTK();

    void Cbh();

    void CcH(1IG r1);

    void CnO(int i);

    void CnP(View view);

    void Cq2(Intent intent);

    void Cu1(int i);

    boolean CyH(03Y r1);

    void D1P(Intent intent);

    void D1Q(Intent intent, Bundle bundle);

    void D1R(Intent intent, int i, Bundle bundle);

    void D3U();

    boolean D3g();

    boolean dispatchGenericMotionEvent(MotionEvent motionEvent);

    boolean dispatchKeyEvent(KeyEvent keyEvent);

    boolean dispatchTouchEvent(MotionEvent motionEvent);

    void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    void finish();

    Intent getIntent();

    void onActivityDestroy();

    void onActivityResult(int i, int i2, Intent intent);

    void onAttachedToWindow();

    void onBackPressed();

    void onConfigurationChanged(Configuration configuration);

    void onContentChanged();

    void onCreate(Bundle bundle);

    void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo);

    View onCreatePanelView(int i);

    void onDestroy();

    boolean onKeyDown(int i, KeyEvent keyEvent);

    boolean onKeyLongPress(int i, KeyEvent keyEvent);

    boolean onKeyUp(int i, KeyEvent keyEvent);

    void onLowMemory();

    void onPause();

    void onResume();

    void onSaveInstanceState(Bundle bundle);

    boolean onSearchRequested();

    void onStart();

    void onStop();

    void onTrimMemory(int i);

    void onWindowFocusChanged(boolean z);

    void startActivityForResult(Intent intent, int i);
}
