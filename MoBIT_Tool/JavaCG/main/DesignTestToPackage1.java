
/** 
*methodTest This code is completely automatically generated by the UDT Tool
 @author Waldemar Neto 
 @author Anderson Ledo 
 @author Franklin Ramalho 
 @author Dalton Serey
**
*/
 public  class DesignTestToPackage1 extends junit.framework.TestCase {private static  org.designwizard.main.DesignWizard dw = null;
  protected  void setUp ()throws Exception{if(dw == null){dw = new org.designwizard.main.DesignWizard("--file--");;

}else{

}
;
super.setUp();
}
 public  void testPackage_Data ()throws java.io.IOException, org.designwizard.exception.InexistentEntityException{org.designwizard.design.PackageNode thePackage = dw.getPackage("Data") ;;
String[]  importedPackages = {"UMLPrimitiveTypes", "JavaPrimitiveTypes"} ;;
java.util.Set<org.designwizard.design.ClassNode> internalEntyties = thePackage.getAllClasses() ;;
java.util.Set<org.designwizard.design.ClassNode> extentableEntiites = internalEntyties ;;
for( String aPackage : importedPackages){extentableEntiites.addAll(dw.getPackage(aPackage).getAllClasses());
};
for( org.designwizard.design.ClassNode aEntity : internalEntyties){assertTrue(aEntity + " cannot extends the class ", extentableEntiites.contains(aEntity.getSuperClass()));
for( org.designwizard.design.ClassNode aInterface : aEntity.getImplementedInterfaces()){assertTrue(aEntity + " cannot implements the interface ", extentableEntiites.contains(aInterface));
};
};
}
 public  void testPackage_edu ()throws org.designwizard.exception.InexistentEntityException, java.io.IOException{org.designwizard.design.PackageNode thePackage = dw.getPackage("edu") ;;
}
 public  void testPackage_edu_umd ()throws org.designwizard.exception.InexistentEntityException, java.io.IOException{org.designwizard.design.PackageNode thePackage = dw.getPackage("edu.umd") ;;
}
 public  void testPackage_edu_umd_cs ()throws java.io.IOException, org.designwizard.exception.InexistentEntityException{org.designwizard.design.PackageNode thePackage = dw.getPackage("edu.umd.cs") ;;
}
 public  void testPackage_edu_umd_cs_findbugs ()throws org.designwizard.exception.InexistentEntityException, java.io.IOException{org.designwizard.design.PackageNode thePackage = dw.getPackage("edu.umd.cs.findbugs") ;;
}
 public  void testPackage_edu_umd_cs_findbugs_asm ()throws java.io.IOException, org.designwizard.exception.InexistentEntityException{org.designwizard.design.PackageNode thePackage = dw.getPackage("edu.umd.cs.findbugs.asm") ;;
}
 public  void testPackage_edu_umd_cs_findbugs_ba ()throws org.designwizard.exception.InexistentEntityException, java.io.IOException{org.designwizard.design.PackageNode thePackage = dw.getPackage("edu.umd.cs.findbugs.ba") ;;
}
 public  void testPackage_edu_umd_cs_findbugs_ba_bcp ()throws java.io.IOException, org.designwizard.exception.InexistentEntityException{org.designwizard.design.PackageNode thePackage = dw.getPackage("edu.umd.cs.findbugs.ba.bcp") ;;
}
 public  void testPackage_edu_umd_cs_findbugs_ba_ca ()throws org.designwizard.exception.InexistentEntityException, java.io.IOException{org.designwizard.design.PackageNode thePackage = dw.getPackage("edu.umd.cs.findbugs.ba.ca") ;;
}
 public  void testPackage_edu_umd_cs_findbugs_ba_ch ()throws org.designwizard.exception.InexistentEntityException, java.io.IOException{org.designwizard.design.PackageNode thePackage = dw.getPackage("edu.umd.cs.findbugs.ba.ch") ;;
}
 public  void testPackage_edu_umd_cs_findbugs_ba_constant ()throws java.io.IOException, org.designwizard.exception.InexistentEntityException{org.designwizard.design.PackageNode thePackage = dw.getPackage("edu.umd.cs.findbugs.ba.constant") ;;
}
 public  void testPackage_edu_umd_cs_findbugs_ba_deref ()throws java.io.IOException, org.designwizard.exception.InexistentEntityException{org.designwizard.design.PackageNode thePackage = dw.getPackage("edu.umd.cs.findbugs.ba.deref") ;;
}
 public  void testPackage_edu_umd_cs_findbugs_ba_generic ()throws org.designwizard.exception.InexistentEntityException, java.io.IOException{org.designwizard.design.PackageNode thePackage = dw.getPackage("edu.umd.cs.findbugs.ba.generic") ;;
}
 public  void testPackage_edu_umd_cs_findbugs_ba_heap ()throws java.io.IOException, org.designwizard.exception.InexistentEntityException{org.designwizard.design.PackageNode thePackage = dw.getPackage("edu.umd.cs.findbugs.ba.heap") ;;
}
 public  void testPackage_edu_umd_cs_findbugs_ba_interproc ()throws java.io.IOException, org.designwizard.exception.InexistentEntityException{org.designwizard.design.PackageNode thePackage = dw.getPackage("edu.umd.cs.findbugs.ba.interproc") ;;
}
 public  void testPackage_edu_umd_cs_findbugs_ba_jsr305 ()throws org.designwizard.exception.InexistentEntityException, java.io.IOException{org.designwizard.design.PackageNode thePackage = dw.getPackage("edu.umd.cs.findbugs.ba.jsr305") ;;
}
 public  void testPackage_edu_umd_cs_findbugs_ba_npe ()throws java.io.IOException, org.designwizard.exception.InexistentEntityException{org.designwizard.design.PackageNode thePackage = dw.getPackage("edu.umd.cs.findbugs.ba.npe") ;;
}
 public  void testPackage_edu_umd_cs_findbugs_ba_npe2 ()throws org.designwizard.exception.InexistentEntityException, java.io.IOException{org.designwizard.design.PackageNode thePackage = dw.getPackage("edu.umd.cs.findbugs.ba.npe2") ;;
}
 public  void testPackage_edu_umd_cs_findbugs_ba_obl ()throws org.designwizard.exception.InexistentEntityException, java.io.IOException{org.designwizard.design.PackageNode thePackage = dw.getPackage("edu.umd.cs.findbugs.ba.obl") ;;
}
 public  void testPackage_edu_umd_cs_findbugs_ba_rta ()throws java.io.IOException, org.designwizard.exception.InexistentEntityException{org.designwizard.design.PackageNode thePackage = dw.getPackage("edu.umd.cs.findbugs.ba.rta") ;;
}
 public  void testPackage_edu_umd_cs_findbugs_ba_type ()throws org.designwizard.exception.InexistentEntityException, java.io.IOException{org.designwizard.design.PackageNode thePackage = dw.getPackage("edu.umd.cs.findbugs.ba.type") ;;
}
 public  void testPackage_edu_umd_cs_findbugs_ba_vna ()throws java.io.IOException, org.designwizard.exception.InexistentEntityException{org.designwizard.design.PackageNode thePackage = dw.getPackage("edu.umd.cs.findbugs.ba.vna") ;;
}
 public  void testPackage_edu_umd_cs_findbugs_bcel ()throws java.io.IOException, org.designwizard.exception.InexistentEntityException{org.designwizard.design.PackageNode thePackage = dw.getPackage("edu.umd.cs.findbugs.bcel") ;;
}
 public  void testPackage_edu_umd_cs_findbugs_classfile ()throws java.io.IOException, org.designwizard.exception.InexistentEntityException{org.designwizard.design.PackageNode thePackage = dw.getPackage("edu.umd.cs.findbugs.classfile") ;;
}
 public  void testPackage_edu_umd_cs_findbugs_classfile_analysis ()throws java.io.IOException, org.designwizard.exception.InexistentEntityException{org.designwizard.design.PackageNode thePackage = dw.getPackage("edu.umd.cs.findbugs.classfile.analysis") ;;
}
 public  void testPackage_edu_umd_cs_findbugs_classfile_engine ()throws org.designwizard.exception.InexistentEntityException, java.io.IOException{org.designwizard.design.PackageNode thePackage = dw.getPackage("edu.umd.cs.findbugs.classfile.engine") ;;
}
 public  void testPackage_edu_umd_cs_findbugs_classfile_engine_asm ()throws org.designwizard.exception.InexistentEntityException, java.io.IOException{org.designwizard.design.PackageNode thePackage = dw.getPackage("edu.umd.cs.findbugs.classfile.engine.asm") ;;
}
 public  void testPackage_edu_umd_cs_findbugs_classfile_engine_bcel ()throws org.designwizard.exception.InexistentEntityException, java.io.IOException{org.designwizard.design.PackageNode thePackage = dw.getPackage("edu.umd.cs.findbugs.classfile.engine.bcel") ;;
}
 public  void testPackage_edu_umd_cs_findbugs_classfile_impl ()throws org.designwizard.exception.InexistentEntityException, java.io.IOException{org.designwizard.design.PackageNode thePackage = dw.getPackage("edu.umd.cs.findbugs.classfile.impl") ;;
}
 public  void testPackage_edu_umd_cs_findbugs_config ()throws java.io.IOException, org.designwizard.exception.InexistentEntityException{org.designwizard.design.PackageNode thePackage = dw.getPackage("edu.umd.cs.findbugs.config") ;;
}
 public  void testPackage_edu_umd_cs_findbugs_detect ()throws org.designwizard.exception.InexistentEntityException, java.io.IOException{org.designwizard.design.PackageNode thePackage = dw.getPackage("edu.umd.cs.findbugs.detect") ;;
}
 public  void testPackage_edu_umd_cs_findbugs_filter ()throws org.designwizard.exception.InexistentEntityException, java.io.IOException{org.designwizard.design.PackageNode thePackage = dw.getPackage("edu.umd.cs.findbugs.filter") ;;
}
 public  void testPackage_edu_umd_cs_findbugs_graph ()throws java.io.IOException, org.designwizard.exception.InexistentEntityException{org.designwizard.design.PackageNode thePackage = dw.getPackage("edu.umd.cs.findbugs.graph") ;;
}
 public  void testPackage_edu_umd_cs_findbugs_gui ()throws org.designwizard.exception.InexistentEntityException, java.io.IOException{org.designwizard.design.PackageNode thePackage = dw.getPackage("edu.umd.cs.findbugs.gui") ;;
}
 public  void testPackage_edu_umd_cs_findbugs_io ()throws org.designwizard.exception.InexistentEntityException, java.io.IOException{org.designwizard.design.PackageNode thePackage = dw.getPackage("edu.umd.cs.findbugs.io") ;;
}
 public  void testPackage_edu_umd_cs_findbugs_jaif ()throws java.io.IOException, org.designwizard.exception.InexistentEntityException{org.designwizard.design.PackageNode thePackage = dw.getPackage("edu.umd.cs.findbugs.jaif") ;;
}
 public  void testPackage_edu_umd_cs_findbugs_log ()throws java.io.IOException, org.designwizard.exception.InexistentEntityException{org.designwizard.design.PackageNode thePackage = dw.getPackage("edu.umd.cs.findbugs.log") ;;
}
 public  void testPackage_edu_umd_cs_findbugs_ml ()throws org.designwizard.exception.InexistentEntityException, java.io.IOException{org.designwizard.design.PackageNode thePackage = dw.getPackage("edu.umd.cs.findbugs.ml") ;;
}
 public  void testPackage_edu_umd_cs_findbugs_model ()throws java.io.IOException, org.designwizard.exception.InexistentEntityException{org.designwizard.design.PackageNode thePackage = dw.getPackage("edu.umd.cs.findbugs.model") ;;
}
 public  void testPackage_edu_umd_cs_findbugs_plan ()throws java.io.IOException, org.designwizard.exception.InexistentEntityException{org.designwizard.design.PackageNode thePackage = dw.getPackage("edu.umd.cs.findbugs.plan") ;;
}
 public  void testPackage_edu_umd_cs_findbugs_props ()throws java.io.IOException, org.designwizard.exception.InexistentEntityException{org.designwizard.design.PackageNode thePackage = dw.getPackage("edu.umd.cs.findbugs.props") ;;
}
 public  void testPackage_edu_umd_cs_findbugs_userAnnotations ()throws org.designwizard.exception.InexistentEntityException, java.io.IOException{org.designwizard.design.PackageNode thePackage = dw.getPackage("edu.umd.cs.findbugs.userAnnotations") ;;
}
 public  void testPackage_edu_umd_cs_findbugs_userAnnotations_ri ()throws org.designwizard.exception.InexistentEntityException, java.io.IOException{org.designwizard.design.PackageNode thePackage = dw.getPackage("edu.umd.cs.findbugs.userAnnotations.ri") ;;
}
 public  void testPackage_edu_umd_cs_findbugs_util ()throws org.designwizard.exception.InexistentEntityException, java.io.IOException{org.designwizard.design.PackageNode thePackage = dw.getPackage("edu.umd.cs.findbugs.util") ;;
}
 public  void testPackage_edu_umd_cs_findbugs_visitclass ()throws org.designwizard.exception.InexistentEntityException, java.io.IOException{org.designwizard.design.PackageNode thePackage = dw.getPackage("edu.umd.cs.findbugs.visitclass") ;;
}
 public  void testPackage_edu_umd_cs_findbugs_workflow ()throws org.designwizard.exception.InexistentEntityException, java.io.IOException{org.designwizard.design.PackageNode thePackage = dw.getPackage("edu.umd.cs.findbugs.workflow") ;;
}
 public  void testPackage_edu_umd_cs_findbugs_xml ()throws java.io.IOException, org.designwizard.exception.InexistentEntityException{org.designwizard.design.PackageNode thePackage = dw.getPackage("edu.umd.cs.findbugs.xml") ;;
}
 public  void testPackage_Default ()throws org.designwizard.exception.InexistentEntityException, java.io.IOException{org.designwizard.design.PackageNode thePackage = dw.getPackage("Default") ;;
}
 public  void testPackage_org ()throws java.io.IOException, org.designwizard.exception.InexistentEntityException{org.designwizard.design.PackageNode thePackage = dw.getPackage("org") ;;
}
 public  void testPackage_org_apache ()throws java.io.IOException, org.designwizard.exception.InexistentEntityException{org.designwizard.design.PackageNode thePackage = dw.getPackage("org.apache") ;;
}
 public  void testPackage_org_apache_bcel ()throws java.io.IOException, org.designwizard.exception.InexistentEntityException{org.designwizard.design.PackageNode thePackage = dw.getPackage("org.apache.bcel") ;;
}
 public  void testPackage_org_apache_bcel_generic ()throws java.io.IOException, org.designwizard.exception.InexistentEntityException{org.designwizard.design.PackageNode thePackage = dw.getPackage("org.apache.bcel.generic") ;;
}
 public  void testPackage_org_apache_bcel_classfile ()throws java.io.IOException, org.designwizard.exception.InexistentEntityException{org.designwizard.design.PackageNode thePackage = dw.getPackage("org.apache.bcel.classfile") ;;
}
 public  void testPackage_org_apache_bcel_util ()throws org.designwizard.exception.InexistentEntityException, java.io.IOException{org.designwizard.design.PackageNode thePackage = dw.getPackage("org.apache.bcel.util") ;;
}
 public  void testPackage_org_xml ()throws org.designwizard.exception.InexistentEntityException, java.io.IOException{org.designwizard.design.PackageNode thePackage = dw.getPackage("org.xml") ;;
}
 public  void testPackage_org_xml_sax ()throws java.io.IOException, org.designwizard.exception.InexistentEntityException{org.designwizard.design.PackageNode thePackage = dw.getPackage("org.xml.sax") ;;
}
 public  void testPackage_org_xml_sax_helpers ()throws org.designwizard.exception.InexistentEntityException, java.io.IOException{org.designwizard.design.PackageNode thePackage = dw.getPackage("org.xml.sax.helpers") ;;
}
 public  void testPackage_java ()throws org.designwizard.exception.InexistentEntityException, java.io.IOException{org.designwizard.design.PackageNode thePackage = dw.getPackage("java") ;;
}
 public  void testPackage_java_util ()throws java.io.IOException, org.designwizard.exception.InexistentEntityException{org.designwizard.design.PackageNode thePackage = dw.getPackage("java.util") ;;
}
 public  void testPackage_java_util_zip ()throws org.designwizard.exception.InexistentEntityException, java.io.IOException{org.designwizard.design.PackageNode thePackage = dw.getPackage("java.util.zip") ;;
}
 public  void testPackage_java_util_regex ()throws org.designwizard.exception.InexistentEntityException, java.io.IOException{org.designwizard.design.PackageNode thePackage = dw.getPackage("java.util.regex") ;;
}
 public  void testPackage_java_util_concurrent ()throws org.designwizard.exception.InexistentEntityException, java.io.IOException{org.designwizard.design.PackageNode thePackage = dw.getPackage("java.util.concurrent") ;;
}
 public  void testPackage_java_util_concurrent_atomic ()throws java.io.IOException, org.designwizard.exception.InexistentEntityException{org.designwizard.design.PackageNode thePackage = dw.getPackage("java.util.concurrent.atomic") ;;
}
 public  void testPackage_java_lang ()throws org.designwizard.exception.InexistentEntityException, java.io.IOException{org.designwizard.design.PackageNode thePackage = dw.getPackage("java.lang") ;;
}
 public  void testPackage_java_lang_annotation ()throws java.io.IOException, org.designwizard.exception.InexistentEntityException{org.designwizard.design.PackageNode thePackage = dw.getPackage("java.lang.annotation") ;;
}
 public  void testPackage_java_lang_reflect ()throws org.designwizard.exception.InexistentEntityException, java.io.IOException{org.designwizard.design.PackageNode thePackage = dw.getPackage("java.lang.reflect") ;;
}
 public  void testPackage_java_lang_management ()throws java.io.IOException, org.designwizard.exception.InexistentEntityException{org.designwizard.design.PackageNode thePackage = dw.getPackage("java.lang.management") ;;
}
 public  void testPackage_java_io ()throws org.designwizard.exception.InexistentEntityException, java.io.IOException{org.designwizard.design.PackageNode thePackage = dw.getPackage("java.io") ;;
}
 public  void testPackage_java_awt ()throws org.designwizard.exception.InexistentEntityException, java.io.IOException{org.designwizard.design.PackageNode thePackage = dw.getPackage("java.awt") ;;
}
 public  void testPackage_java_awt_event ()throws org.designwizard.exception.InexistentEntityException, java.io.IOException{org.designwizard.design.PackageNode thePackage = dw.getPackage("java.awt.event") ;;
}
 public  void testPackage_java_security ()throws org.designwizard.exception.InexistentEntityException, java.io.IOException{org.designwizard.design.PackageNode thePackage = dw.getPackage("java.security") ;;
}
 public  void testPackage_java_nio ()throws org.designwizard.exception.InexistentEntityException, java.io.IOException{org.designwizard.design.PackageNode thePackage = dw.getPackage("java.nio") ;;
}
 public  void testPackage_java_nio_charset ()throws org.designwizard.exception.InexistentEntityException, java.io.IOException{org.designwizard.design.PackageNode thePackage = dw.getPackage("java.nio.charset") ;;
}
 public  void testPackage_java_net ()throws java.io.IOException, org.designwizard.exception.InexistentEntityException{org.designwizard.design.PackageNode thePackage = dw.getPackage("java.net") ;;
}
 public  void testPackage_java_math ()throws java.io.IOException, org.designwizard.exception.InexistentEntityException{org.designwizard.design.PackageNode thePackage = dw.getPackage("java.math") ;;
}
 public  void testPackage_java_beans ()throws org.designwizard.exception.InexistentEntityException, java.io.IOException{org.designwizard.design.PackageNode thePackage = dw.getPackage("java.beans") ;;
}
 public  void testPackage_java_text ()throws org.designwizard.exception.InexistentEntityException, java.io.IOException{org.designwizard.design.PackageNode thePackage = dw.getPackage("java.text") ;;
}
 public  void testPackage_javax ()throws java.io.IOException, org.designwizard.exception.InexistentEntityException{org.designwizard.design.PackageNode thePackage = dw.getPackage("javax") ;;
}
 public  void testPackage_javax_swing ()throws java.io.IOException, org.designwizard.exception.InexistentEntityException{org.designwizard.design.PackageNode thePackage = dw.getPackage("javax.swing") ;;
}
 public  void testPackage_javax_swing_tree ()throws org.designwizard.exception.InexistentEntityException, java.io.IOException{org.designwizard.design.PackageNode thePackage = dw.getPackage("javax.swing.tree") ;;
}
 public  void testPackage_javax_swing_table ()throws org.designwizard.exception.InexistentEntityException, java.io.IOException{org.designwizard.design.PackageNode thePackage = dw.getPackage("javax.swing.table") ;;
}
 public  void testPackage_javax_swing_event ()throws java.io.IOException, org.designwizard.exception.InexistentEntityException{org.designwizard.design.PackageNode thePackage = dw.getPackage("javax.swing.event") ;;
}
 public  void testPackage_javax_swing_filechooser ()throws org.designwizard.exception.InexistentEntityException, java.io.IOException{org.designwizard.design.PackageNode thePackage = dw.getPackage("javax.swing.filechooser") ;;
}
 public  void testPackage_javax_xml ()throws java.io.IOException, org.designwizard.exception.InexistentEntityException{org.designwizard.design.PackageNode thePackage = dw.getPackage("javax.xml") ;;
}
 public  void testPackage_javax_xml_transform ()throws java.io.IOException, org.designwizard.exception.InexistentEntityException{org.designwizard.design.PackageNode thePackage = dw.getPackage("javax.xml.transform") ;;
}
 public  void testPackage_com ()throws org.designwizard.exception.InexistentEntityException, java.io.IOException{org.designwizard.design.PackageNode thePackage = dw.getPackage("com") ;;
}
 public  void testPackage_com_sun ()throws java.io.IOException, org.designwizard.exception.InexistentEntityException{org.designwizard.design.PackageNode thePackage = dw.getPackage("com.sun") ;;
}
 public  void testPackage_com_sun_management ()throws org.designwizard.exception.InexistentEntityException, java.io.IOException{org.designwizard.design.PackageNode thePackage = dw.getPackage("com.sun.management") ;;
}
 public  void testPackage_Virtual dependencies ()throws java.io.IOException, org.designwizard.exception.InexistentEntityException{org.designwizard.design.PackageNode thePackage = dw.getPackage("Virtual dependencies") ;;
}
}
