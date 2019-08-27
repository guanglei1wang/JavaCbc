package org.bytedeco.cbc.presets;

import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.annotation.Opaque;

@Opaque 
public class Cbc_Model extends Pointer{
    /**Empty constructor.Calls **/
    public Cbc_Model(){super((Pointer)null);}
    /** pointer cast constuctor **/ 
    public Cbc_Model(Pointer p){super(p);}
}

