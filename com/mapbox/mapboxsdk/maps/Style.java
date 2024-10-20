package com.mapbox.mapboxsdk.maps;

import X.1BK;
import X.7zL;
import X.AnonymousClass001;
import X.GOo;
import X.JQy;
import X.JQz;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.Pair;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.mapbox.mapboxsdk.style.layers.Layer;
import com.mapbox.mapboxsdk.style.layers.TransitionOptions;
import com.mapbox.mapboxsdk.style.light.Light;
import com.mapbox.mapboxsdk.style.sources.Source;
import com.mapbox.mapboxsdk.utils.BitmapUtils;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: Style.class */
public class Style {
    public static final String DARK = "mapbox://styles/mapbox/dark-v10";
    public static final String LIGHT = "mapbox://styles/mapbox/light-v10";
    public static final String MAPBOX_STREETS = "mapbox://styles/mapbox/streets-v11";
    public static final String OUTDOORS = "mapbox://styles/mapbox/outdoors-v11";
    public static final String SATELLITE = "mapbox://styles/mapbox/satellite-v9";
    public static final String SATELLITE_STREETS = "mapbox://styles/mapbox/satellite-streets-v11";
    public static final String TRAFFIC_DAY = "mapbox://styles/mapbox/traffic-day-v2";
    public static final String TRAFFIC_NIGHT = "mapbox://styles/mapbox/traffic-night-v2";
    public final Builder builder;
    public boolean fullyLoaded;
    public final HashMap images;
    public final HashMap layers;
    public final NativeMap nativeMap;
    public final HashMap sources;

    /* loaded from: Style$BitmapImageConversionTask.class */
    public class BitmapImageConversionTask extends AsyncTask {
        public WeakReference nativeMap;

        public BitmapImageConversionTask(NativeMap nativeMap) {
            this.nativeMap = 7zL.A14(nativeMap);
        }

        @Override // android.os.AsyncTask
        public Image[] doInBackground(Builder.ImageWrapper... imageWrapperArr) {
            ArrayList A0s = AnonymousClass001.A0s();
            int length = imageWrapperArr.length;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    return (Image[]) A0s.toArray(new Image[A0s.size()]);
                }
                A0s.add(Style.toImage(imageWrapperArr[i2]));
                i = i2 + 1;
            }
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Image[] imageArr) {
            super.onPostExecute((BitmapImageConversionTask) imageArr);
            NativeMap nativeMap = (NativeMap) this.nativeMap.get();
            if (nativeMap == null || nativeMap.isDestroyed()) {
                return;
            }
            nativeMap.addImages(imageArr);
        }
    }

    /* loaded from: Style$Builder.class */
    public final class Builder {
        public String styleJson;
        public String styleUri;
        public TransitionOptions transitionOptions;
        public final List sources = AnonymousClass001.A0s();
        public final List layers = AnonymousClass001.A0s();
        public final List images = AnonymousClass001.A0s();

        /* loaded from: Style$Builder$ImageWrapper.class */
        public class ImageWrapper {
            public Bitmap bitmap;
            public String id;
            public boolean sdf;

            public ImageWrapper(String str, Bitmap bitmap, boolean z) {
                this.id = str;
                this.bitmap = bitmap;
                this.sdf = z;
            }

            public static ImageWrapper[] convertToImageArray(HashMap hashMap, boolean z) {
                ImageWrapper[] imageWrapperArr = new ImageWrapper[hashMap.size()];
                ArrayList A17 = 1BK.A17(hashMap.keySet());
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= hashMap.size()) {
                        return imageWrapperArr;
                    }
                    String str = (String) A17.get(i2);
                    imageWrapperArr[i2] = new ImageWrapper(str, (Bitmap) hashMap.get(str), z);
                    i = i2 + 1;
                }
            }
        }

        /* loaded from: Style$Builder$LayerAboveWrapper.class */
        public class LayerAboveWrapper extends LayerWrapper {
            public String aboveLayer;

            public LayerAboveWrapper(Layer layer, String str) {
                super(layer);
                this.aboveLayer = str;
            }
        }

        /* loaded from: Style$Builder$LayerAtWrapper.class */
        public class LayerAtWrapper extends LayerWrapper {
            public int index;

            public LayerAtWrapper(Layer layer, int i) {
                super(layer);
                this.index = i;
            }
        }

        /* loaded from: Style$Builder$LayerBelowWrapper.class */
        public class LayerBelowWrapper extends LayerWrapper {
            public String belowLayer;

            public LayerBelowWrapper(Layer layer, String str) {
                super(layer);
                this.belowLayer = str;
            }
        }

        /* loaded from: Style$Builder$LayerWrapper.class */
        public class LayerWrapper {
            public Layer layer;

            public LayerWrapper(Layer layer) {
                this.layer = layer;
            }
        }

        public Style build(NativeMap nativeMap) {
            return new Style(this, nativeMap);
        }

        public Builder fromJson(String str) {
            this.styleJson = str;
            return this;
        }

        public Builder fromUri(String str) {
            this.styleUri = str;
            return this;
        }

        public Builder fromUrl(String str) {
            this.styleUri = str;
            return this;
        }

        public List getImages() {
            return this.images;
        }

        public String getJson() {
            return this.styleJson;
        }

        public List getLayers() {
            return this.layers;
        }

        public List getSources() {
            return this.sources;
        }

        public TransitionOptions getTransitionOptions() {
            return this.transitionOptions;
        }

        public String getUri() {
            return this.styleUri;
        }

        public Builder withBitmapImages(boolean z, Pair... pairArr) {
            int length = pairArr.length;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    return this;
                }
                Pair pair = pairArr[i2];
                withImage((String) pair.first, (Bitmap) pair.second, z);
                i = i2 + 1;
            }
        }

        public Builder withBitmapImages(Pair... pairArr) {
            int length = pairArr.length;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    return this;
                }
                Pair pair = pairArr[i2];
                withImage((String) pair.first, (Bitmap) pair.second, false);
                i = i2 + 1;
            }
        }

        public Builder withDrawableImages(boolean z, Pair... pairArr) {
            int length = pairArr.length;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    return this;
                }
                Pair pair = pairArr[i2];
                Bitmap bitmapFromDrawable = BitmapUtils.getBitmapFromDrawable((Drawable) pair.second);
                if (bitmapFromDrawable == null) {
                    throw AnonymousClass001.A0L("Provided drawable couldn't be converted to a Bitmap.");
                }
                withImage((String) pair.first, bitmapFromDrawable, z);
                i = i2 + 1;
            }
        }

        public Builder withDrawableImages(Pair... pairArr) {
            withDrawableImages(false, pairArr);
            return this;
        }

        public Builder withImage(String str, Bitmap bitmap) {
            withImage(str, bitmap, false);
            return this;
        }

        public Builder withImage(String str, Bitmap bitmap, boolean z) {
            this.images.add(new ImageWrapper(str, bitmap, z));
            return this;
        }

        public Builder withImage(String str, Drawable drawable) {
            Bitmap bitmapFromDrawable = BitmapUtils.getBitmapFromDrawable(drawable);
            if (bitmapFromDrawable == null) {
                throw AnonymousClass001.A0L("Provided drawable couldn't be converted to a Bitmap.");
            }
            withImage(str, bitmapFromDrawable, false);
            return this;
        }

        public Builder withImage(String str, Drawable drawable, boolean z) {
            Bitmap bitmapFromDrawable = BitmapUtils.getBitmapFromDrawable(drawable);
            if (bitmapFromDrawable == null) {
                throw AnonymousClass001.A0L("Provided drawable couldn't be converted to a Bitmap.");
            }
            withImage(str, bitmapFromDrawable, z);
            return this;
        }

        public Builder withLayer(Layer layer) {
            this.layers.add(new LayerWrapper(layer));
            return this;
        }

        public Builder withLayerAbove(Layer layer, String str) {
            this.layers.add(new LayerAboveWrapper(layer, str));
            return this;
        }

        public Builder withLayerAt(Layer layer, int i) {
            this.layers.add(new LayerAtWrapper(layer, i));
            return this;
        }

        public Builder withLayerBelow(Layer layer, String str) {
            this.layers.add(new LayerBelowWrapper(layer, str));
            return this;
        }

        public Builder withLayers(Layer... layerArr) {
            int length = layerArr.length;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    return this;
                }
                this.layers.add(new LayerWrapper(layerArr[i2]));
                i = i2 + 1;
            }
        }

        public Builder withSource(Source source) {
            this.sources.add(source);
            return this;
        }

        public Builder withSources(Source... sourceArr) {
            this.sources.addAll(Arrays.asList(sourceArr));
            return this;
        }

        public Builder withTransition(TransitionOptions transitionOptions) {
            this.transitionOptions = transitionOptions;
            return this;
        }
    }

    /* loaded from: Style$OnStyleLoaded.class */
    public interface OnStyleLoaded {
        void onStyleLoaded(Style style);
    }

    public Style(Builder builder, NativeMap nativeMap) {
        this.sources = AnonymousClass001.A0u();
        this.layers = AnonymousClass001.A0u();
        this.images = AnonymousClass001.A0u();
        this.builder = builder;
        this.nativeMap = nativeMap;
    }

    public static Image toImage(Builder.ImageWrapper imageWrapper) {
        Bitmap bitmap = imageWrapper.bitmap;
        Bitmap.Config config = bitmap.getConfig();
        Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
        if (config != config2) {
            bitmap = bitmap.copy(config2, false);
        }
        ByteBuffer allocate = ByteBuffer.allocate(bitmap.getByteCount());
        bitmap.copyPixelsToBuffer(allocate);
        return new Image(allocate.array(), bitmap.getDensity() / 160.0f, imageWrapper.id, bitmap.getWidth(), bitmap.getHeight(), imageWrapper.sdf);
    }

    private void validateState(String str) {
        if (!this.fullyLoaded) {
            throw JQy.A0k("Calling %s when a newer style is loading/has loaded.", new Object[]{str});
        }
    }

    public void addImage(String str, Bitmap bitmap) {
        addImage(str, bitmap, false);
    }

    public void addImage(String str, Bitmap bitmap, boolean z) {
        validateState("addImage");
        this.nativeMap.addImages(new Image[]{toImage(new Builder.ImageWrapper(str, bitmap, z))});
    }

    public void addImage(String str, Drawable drawable) {
        Bitmap bitmapFromDrawable = BitmapUtils.getBitmapFromDrawable(drawable);
        if (bitmapFromDrawable == null) {
            throw AnonymousClass001.A0L("Provided drawable couldn't be converted to a Bitmap.");
        }
        addImage(str, bitmapFromDrawable, false);
    }

    public void addImageAsync(String str, Bitmap bitmap) {
        addImageAsync(str, bitmap, false);
    }

    public void addImageAsync(String str, Bitmap bitmap, boolean z) {
        validateState("addImage");
        new BitmapImageConversionTask(this.nativeMap).execute(new Builder.ImageWrapper(str, bitmap, z));
    }

    public void addImageAsync(String str, Drawable drawable) {
        Bitmap bitmapFromDrawable = BitmapUtils.getBitmapFromDrawable(drawable);
        if (bitmapFromDrawable == null) {
            throw AnonymousClass001.A0L("Provided drawable couldn't be converted to a Bitmap.");
        }
        addImageAsync(str, bitmapFromDrawable, false);
    }

    public void addImages(HashMap hashMap) {
        addImages(hashMap, false);
    }

    public void addImages(HashMap hashMap, boolean z) {
        validateState("addImage");
        Image[] imageArr = new Image[hashMap.size()];
        int i = 0;
        for (Builder.ImageWrapper imageWrapper : Builder.ImageWrapper.convertToImageArray(hashMap, z)) {
            imageArr[i] = toImage(imageWrapper);
            i++;
        }
        this.nativeMap.addImages(imageArr);
    }

    public void addImagesAsync(HashMap hashMap) {
        addImagesAsync(hashMap, false);
    }

    public void addImagesAsync(HashMap hashMap, boolean z) {
        validateState("addImages");
        new BitmapImageConversionTask(this.nativeMap).execute(Builder.ImageWrapper.convertToImageArray(hashMap, z));
    }

    public void addLayer(Layer layer) {
        validateState("addLayer");
        this.nativeMap.addLayer(layer);
        HashMap hashMap = this.layers;
        JQz.A0y();
        hashMap.put(layer.nativeGetId(), layer);
    }

    public void addLayerAbove(Layer layer, String str) {
        validateState("addLayerAbove");
        this.nativeMap.addLayerAbove(layer, str);
        HashMap hashMap = this.layers;
        JQz.A0y();
        hashMap.put(layer.nativeGetId(), layer);
    }

    public void addLayerAt(Layer layer, int i) {
        validateState("addLayerAbove");
        this.nativeMap.addLayerAt(layer, i);
        HashMap hashMap = this.layers;
        JQz.A0y();
        hashMap.put(layer.nativeGetId(), layer);
    }

    public void addLayerBelow(Layer layer, String str) {
        validateState("addLayerBelow");
        this.nativeMap.addLayerBelow(layer, str);
        HashMap hashMap = this.layers;
        JQz.A0y();
        hashMap.put(layer.nativeGetId(), layer);
    }

    public void addSource(Source source) {
        validateState("addSource");
        this.nativeMap.addSource(source);
        HashMap hashMap = this.sources;
        JQz.A0z();
        hashMap.put(source.nativeGetId(), source);
    }

    public void clear() {
        this.fullyLoaded = false;
        Iterator A13 = GOo.A13(this.sources);
        while (A13.hasNext()) {
            Source source = (Source) A13.next();
            if (source != null) {
                source.detached = true;
                this.nativeMap.removeSource(source);
            }
        }
        Iterator A132 = GOo.A13(this.layers);
        while (A132.hasNext()) {
            Layer layer = (Layer) A132.next();
            if (layer != null) {
                layer.detached = true;
                this.nativeMap.removeLayer(layer);
            }
        }
        Iterator A0x = AnonymousClass001.A0x(this.images);
        while (A0x.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0x);
            this.nativeMap.removeImage(AnonymousClass001.A0j(A0z));
            ((Bitmap) A0z.getValue()).recycle();
        }
        this.sources.clear();
        this.layers.clear();
        this.images.clear();
    }

    public Bitmap getImage(String str) {
        validateState("getImage");
        return this.nativeMap.getImage(str);
    }

    public String getJson() {
        validateState("getJson");
        return this.nativeMap.getStyleJson();
    }

    public Layer getLayer(String str) {
        validateState("getLayer");
        Layer layer = (Layer) this.layers.get(str);
        if (layer == null) {
            layer = this.nativeMap.getLayer(str);
        }
        return layer;
    }

    public Layer getLayerAs(String str) {
        validateState("getLayerAs");
        return this.nativeMap.getLayer(str);
    }

    public List getLayers() {
        validateState("getLayers");
        return this.nativeMap.getLayers();
    }

    public Light getLight() {
        validateState("getLight");
        return this.nativeMap.getLight();
    }

    public Source getSource(String str) {
        validateState("getSource");
        Source source = (Source) this.sources.get(str);
        if (source == null) {
            source = this.nativeMap.getSource(str);
        }
        return source;
    }

    public Source getSourceAs(String str) {
        validateState("getSourceAs");
        return this.sources.containsKey(str) ? (Source) this.sources.get(str) : this.nativeMap.getSource(str);
    }

    public List getSources() {
        validateState("getSources");
        return this.nativeMap.getSources();
    }

    public TransitionOptions getTransition() {
        validateState("getTransition");
        return this.nativeMap.getTransitionOptions();
    }

    public String getUri() {
        validateState("getUri");
        return this.nativeMap.getStyleUri();
    }

    public String getUrl() {
        validateState("getUrl");
        return this.nativeMap.getStyleUri();
    }

    public boolean isFullyLoaded() {
        return this.fullyLoaded;
    }

    public void onDidFinishLoadingStyle() {
        if (this.fullyLoaded) {
            return;
        }
        this.fullyLoaded = true;
        Iterator it = this.builder.sources.iterator();
        while (it.hasNext()) {
            addSource((Source) it.next());
        }
        for (Builder.LayerWrapper layerWrapper : this.builder.layers) {
            if (layerWrapper instanceof Builder.LayerAtWrapper) {
                addLayerAt(layerWrapper.layer, ((Builder.LayerAtWrapper) layerWrapper).index);
            } else if (layerWrapper instanceof Builder.LayerAboveWrapper) {
                addLayerAbove(layerWrapper.layer, ((Builder.LayerAboveWrapper) layerWrapper).aboveLayer);
            } else {
                addLayerBelow(layerWrapper.layer, layerWrapper instanceof Builder.LayerBelowWrapper ? ((Builder.LayerBelowWrapper) layerWrapper).belowLayer : MapboxConstants.LAYER_ID_ANNOTATIONS);
            }
        }
        for (Builder.ImageWrapper imageWrapper : this.builder.images) {
            addImage(imageWrapper.id, imageWrapper.bitmap, imageWrapper.sdf);
        }
        TransitionOptions transitionOptions = this.builder.transitionOptions;
        if (transitionOptions != null) {
            setTransition(transitionOptions);
        }
    }

    public void removeImage(String str) {
        validateState("removeImage");
        this.nativeMap.removeImage(str);
    }

    public boolean removeLayer(Layer layer) {
        validateState("removeLayer");
        HashMap hashMap = this.layers;
        JQz.A0y();
        hashMap.remove(layer.nativeGetId());
        return this.nativeMap.removeLayer(layer);
    }

    public boolean removeLayer(String str) {
        validateState("removeLayer");
        this.layers.remove(str);
        return this.nativeMap.removeLayer(str);
    }

    public boolean removeLayerAt(int i) {
        validateState("removeLayerAt");
        return this.nativeMap.removeLayerAt(i);
    }

    public boolean removeSource(Source source) {
        validateState("removeSource");
        HashMap hashMap = this.sources;
        JQz.A0z();
        hashMap.remove(source.nativeGetId());
        return this.nativeMap.removeSource(source);
    }

    public boolean removeSource(String str) {
        validateState("removeSource");
        this.sources.remove(str);
        return this.nativeMap.removeSource(str);
    }

    public void setTransition(TransitionOptions transitionOptions) {
        validateState("setTransition");
        this.nativeMap.setTransitionOptions(transitionOptions);
    }
}
