package org.bytedeco.cbc.presets;

import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.annotation.Opaque;

@Opaque 
public class cbc_cut_callback extends Pointer{
    /**Empty constructor.Calls **/
    public cbc_cut_callback(){super((Pointer)null);}
    /** pointer cast constuctor **/ 
    public cbc_cut_callback(Pointer p){super(p);}
}

