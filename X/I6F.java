package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: I6F.class */
public abstract class I6F {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r308v1 */
    /* JADX WARN: Type inference failed for: r308v2 */
    /* JADX WARN: Type inference failed for: r308v3, types: [java.util.AbstractCollection] */
    public static final String A00(View view) {
        List list;
        String str;
        06Z BDe;
        List A0A;
        if (view instanceof GQy) {
            str = (String) ((GQy) view).A1E.getValue();
        } else {
            GSP context = view.getContext();
            GSP gsp = context instanceof GSP ? context : null;
            if (gsp != null) {
                return gsp.A01;
            }
            try {
                str = A02(06Z.A02(view));
            } catch (IllegalStateException e) {
                IDO.A00.A04("RpStores", "Exception thrown while findFragment.localCallIdOptional.", e);
                FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
                if (fragmentActivity == null || (BDe = fragmentActivity.BDe()) == null || (A0A = BDe.A0T.A0A()) == null) {
                    list = C0ty.A00;
                } else {
                    list = AnonymousClass001.A0s();
                    for (Object obj : A0A) {
                        if (obj instanceof GQy) {
                            list.add(obj);
                        }
                    }
                }
                int size = list.size();
                if (size == 0) {
                    str = null;
                } else if (size != 1) {
                    IDO.A02("RpStores", "multiple RpCallUiRoots found");
                    Object A0D = 0QD.A0D(list);
                    11T.A0A(A0D);
                    str = A02((Fragment) A0D);
                } else {
                    Object A0D2 = 0QD.A0D(list);
                    11T.A0A(A0D2);
                    str = A02((Fragment) A0D2);
                }
            }
            if (str == null) {
                ViewParent parent = view.getParent();
                while (true) {
                    ViewParent viewParent = parent;
                    if (viewParent == null) {
                        break;
                    }
                    if (viewParent instanceof GQy) {
                        str = A01(view);
                    }
                    parent = viewParent.getParent();
                }
            }
            if (context instanceof GQy) {
                11T.A0I(context, "null cannot be cast to non-null type com.facebook.rp.platform.statemanagement.RpCallUiRoot");
                str = (String) ((GQy) context).A1E.getValue();
            }
            if (str == null) {
                LinkedHashMap A1C = 1BK.A1C();
                String A0X = AnonymousClass001.A0X(view);
                11T.A0A(A0X);
                A1C.put("view_class_name", A0X);
                try {
                    if (view.getId() > 0) {
                        r306 = view.getResources().getResourceEntryName(view.getId());
                    }
                } catch (Resources.NotFoundException unused) {
                }
                if (r306 != null) {
                    A1C.put("view_resource_name", r306);
                }
                I6E.A02("local_call_id_ui_binding", 11T.A03("view_extension_function"), A1C);
                return str;
            }
            5Vt A0u = GOn.A0u();
            r306 = A0u != null ? A0u.A02 : null;
            if (r306 != null && !str.equals(r306)) {
                I6E.A01("local_call_id_ui_binding", r306, null, C0s8.A14("view_extension_function", "local_call_id_mismatch"), 1BK.A1D("ui_local_call_id", str), true);
                return str;
            }
        }
        return str;
    }

    public static final String A01(View view) {
        11T.A0F(view, 0);
        String A00 = A00(view);
        if (A00 != null) {
            return A00;
        }
        throw AnonymousClass001.A0N("Attempting to access localCallId from hierarchy without RpCallUiRoot.  Fragment or Activity must implement RpCallUiRoot to access localCallId/rpStore.");
    }

    public static final String A02(Fragment fragment) {
        String str;
        11T.A0F(fragment, 0);
        GSP context = fragment.getContext();
        if (fragment instanceof GQy) {
            String str2 = (String) ((GQy) fragment).A1E.getValue();
            5Vt A0u = GOn.A0u();
            if (A0u != null && (str = A0u.A02) != null && !11T.A0O(str2, str)) {
                I6E.A01("local_call_id_ui_binding", str, null, C0s8.A14("fragment_extension_function", "local_call_id_mismatch"), 1BK.A1D("ui_local_call_id", str2), true);
            }
            return str2;
        }
        if (context instanceof GSP) {
            return context.A01;
        }
        Fragment fragment2 = fragment.mParentFragment;
        if (fragment2 != null) {
            return A02(fragment2);
        }
        if (context == null) {
            return null;
        }
        String str3 = fragment.mTag;
        I6E.A02("local_call_id_ui_binding", 11T.A03("fragment_extension_function"), str3 != null ? 1BK.A1D(DKB.A00(397), str3) : null);
        return null;
    }
}
