package org.trc.scm.generator.basic;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.JavaVisibility;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import tk.mybatis.mapper.generator.FalseMethodPlugin;

/**
 * Created by hzcyn on 2018/12/17.
 */
public class MyPlugin extends FalseMethodPlugin {

    @Override
    public boolean modelFieldGenerated(Field field, TopLevelClass topLevelClass, IntrospectedColumn introspectedColumn, IntrospectedTable introspectedTable, ModelClassType modelClassType) {
        processEntityField(field, introspectedColumn);
        return true;
    }

    @Override
    public boolean modelBaseRecordClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        topLevelClass.addImportedType("io.swagger.annotations.ApiModelProperty");
        Field newField = new Field();
        newField.setVisibility(JavaVisibility.PRIVATE);
        newField.setStatic(true);
        newField.setFinal(true);
        newField.setName("serialVersionUID");
        newField.setType(new FullyQualifiedJavaType("long"));
        newField.setInitializationString("1L");
        context.getCommentGenerator().addClassComment(topLevelClass, introspectedTable);
        topLevelClass.addField(newField);
        return true;
    }

    private void processEntityField(Field field, IntrospectedColumn introspectedColumn) {
        field.addAnnotation("@ApiModelProperty(\"" + introspectedColumn.getRemarks() + "\")");
    }
}
