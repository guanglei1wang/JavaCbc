package org.bytedeco.cbc.presets;

import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.Platform;
import org.bytedeco.javacpp.annotation.Properties;
import org.bytedeco.javacpp.tools.Info;
import org.bytedeco.javacpp.tools.InfoMap;
import org.bytedeco.javacpp.tools.InfoMapper;

@Properties(
    target = "org.bytedeco.cbc.presets.Cbc",
    value = @Platform(
        includepath ="/Users/jing/TestCbc/build/include/coin/",
        linkpath = {"/Users/jing/TestCbc/build/lib"},
        include = {"Cbc_C_Interface.h"},
        link ={"CbcSolver", "Cbc", "Clp", "OsiClp", "Osi", "OsiCbc","Cgl","CoinUtils","coinmumps","coinblas","coinlapack","coinmetis","gfortran","pthread"}
    )
)
public class CbcConfig implements InfoMapper {
    public void map(InfoMap infoMap) {
        infoMap.put(new Info("COINLIBAPI").cppTypes().annotations());
        infoMap.put(new Info("COINLINKAGE").cppTypes().annotations());
        infoMap.put(new Info("const CoinBigIndex").pointerTypes("@Cast(\"const CoinBigIndex*\") IntPointer"));
        //infoMap.put(new Info("CoinBigIndex").pointerTypes("int"));
    }
}
