package com.mapbox.mapboxsdk.maps;

import X.0FI;
import X.1BK;
import X.7zL;
import X.AbG;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.JQz;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Toast;
import com.mapbox.mapboxsdk.MapStrictMode;
import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.mapboxsdk.R;
import com.mapbox.mapboxsdk.attribution.Attribution;
import com.mapbox.mapboxsdk.attribution.AttributionParser;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.style.sources.Source;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* loaded from: AttributionDialogManager.class */
public class AttributionDialogManager implements View.OnClickListener, DialogInterface.OnClickListener {
    public static final String MAP_FEEDBACK_LOCATION_FORMAT = "https://apps.mapbox.com/feedback/#/%f/%f/%d";
    public static final String MAP_FEEDBACK_URL = "https://apps.mapbox.com/feedback";
    public Set attributionSet;
    public final Context context;
    public AlertDialog dialog;
    public final MapboxMap mapboxMap;

    /* loaded from: AttributionDialogManager$AttributionBuilder.class */
    public class AttributionBuilder {
        public final WeakReference context;
        public final MapboxMap mapboxMap;

        public AttributionBuilder(MapboxMap mapboxMap, Context context) {
            this.mapboxMap = mapboxMap;
            this.context = 7zL.A14(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Set build() {
            Context context = (Context) this.context.get();
            if (context == null) {
                return Collections.emptySet();
            }
            ArrayList A0s = AnonymousClass001.A0s();
            Style style = this.mapboxMap.getStyle();
            if (style != null) {
                for (Source source : style.getSources()) {
                    JQz.A0z();
                    if (!source.nativeGetAttribution().isEmpty()) {
                        JQz.A0z();
                        A0s.add(source.nativeGetAttribution());
                    }
                }
            }
            return new AttributionParser.Options(context).withCopyrightSign(true).withImproveMap(true).withTelemetryAttribution(true).withAttributionData(AnonymousClass002.A0b(A0s)).build().getAttributions();
        }
    }

    public AttributionDialogManager(Context context, MapboxMap mapboxMap) {
        this.context = context;
        this.mapboxMap = mapboxMap;
    }

    private String buildMapFeedbackMapUrl(CameraPosition cameraPosition) {
        if (cameraPosition == null) {
            return MAP_FEEDBACK_URL;
        }
        Locale locale = Locale.getDefault();
        LatLng latLng = cameraPosition.target;
        return String.format(locale, MAP_FEEDBACK_LOCATION_FORMAT, 1BK.A1a(Double.valueOf(latLng.longitude), Double.valueOf(latLng.latitude), (int) cameraPosition.zoom));
    }

    private String[] getAttributionTitles() {
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = this.attributionSet.iterator();
        while (it.hasNext()) {
            A0s.add(((Attribution) it.next()).getTitle());
        }
        return AnonymousClass002.A0b(A0s);
    }

    private boolean isLatestEntry(int i) {
        boolean z = true;
        if (i != getAttributionTitles().length - 1) {
            z = false;
        }
        return z;
    }

    private void showMapFeedbackWebPage(int i) {
        Set set = this.attributionSet;
        String url = ((Attribution[]) set.toArray(new Attribution[set.size()]))[i].getUrl();
        if (url.contains(MAP_FEEDBACK_URL)) {
            url = buildMapFeedbackMapUrl(JQz.A0Z(this.mapboxMap));
        }
        showWebPage(url);
    }

    private void showTelemetryDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.context);
        builder.setTitle(R.string.mapbox_attributionTelemetryTitle);
        builder.setMessage(R.string.mapbox_attributionTelemetryMessage);
        builder.setPositiveButton(R.string.mapbox_attributionTelemetryPositive, new DialogInterface.OnClickListener() { // from class: com.mapbox.mapboxsdk.maps.AttributionDialogManager.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                TelemetryDefinition telemetryDefinition = Mapbox.INSTANCE.telemetry;
                if (telemetryDefinition != null) {
                    telemetryDefinition.setUserTelemetryRequestState(true);
                }
                dialogInterface.cancel();
            }
        });
        builder.setNeutralButton(R.string.mapbox_attributionTelemetryNeutral, new DialogInterface.OnClickListener() { // from class: com.mapbox.mapboxsdk.maps.AttributionDialogManager.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                AttributionDialogManager attributionDialogManager = AttributionDialogManager.this;
                attributionDialogManager.showWebPage(attributionDialogManager.context.getResources().getString(R.string.mapbox_telemetryLink));
                dialogInterface.cancel();
            }
        });
        builder.setNegativeButton(R.string.mapbox_attributionTelemetryNegative, new DialogInterface.OnClickListener() { // from class: com.mapbox.mapboxsdk.maps.AttributionDialogManager.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                TelemetryDefinition telemetryDefinition = Mapbox.INSTANCE.telemetry;
                if (telemetryDefinition != null) {
                    telemetryDefinition.setUserTelemetryRequestState(false);
                }
                dialogInterface.cancel();
            }
        });
        builder.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showWebPage(String str) {
        try {
            Intent A05 = AbG.A05();
            A05.setData(Uri.parse(str));
            this.context.startActivity(A05);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(this.context, R.string.mapbox_attributionErrorNoBrowser, 1).show();
            MapStrictMode.strictModeViolation(e);
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        if (isLatestEntry(i)) {
            showTelemetryDialog();
        } else {
            showMapFeedbackWebPage(i);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int A05 = 0FI.A05(-1444342116);
        this.attributionSet = new AttributionBuilder(this.mapboxMap, view.getContext()).build();
        Context context = this.context;
        if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
            showAttributionDialog(getAttributionTitles());
        }
        0FI.A0B(-965640579, A05);
    }

    public void onStop() {
        AlertDialog alertDialog = this.dialog;
        if (alertDialog == null || !alertDialog.isShowing()) {
            return;
        }
        this.dialog.dismiss();
    }

    public void showAttributionDialog(String[] strArr) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.context);
        builder.setTitle(R.string.mapbox_attributionsDialogTitle);
        builder.setAdapter(new ArrayAdapter(this.context, R.layout.mapbox_attribution_list_item, strArr), this);
        this.dialog = builder.show();
    }
}
