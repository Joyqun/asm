/*
 * �ļ�����StatelessDefaultSubjectFactory.java
 * ��Ȩ��Copyright by www.sam-world.com
 * ������
 * �޸��ˣ�nate
 * �޸�ʱ�䣺2015��6��3��
 * ���ٵ��ţ�
 * �޸ĵ��ţ�
 * �޸����ݣ�
 */

package com.sam.yh.mgt;

import org.apache.shiro.subject.Subject;
import org.apache.shiro.subject.SubjectContext;
import org.apache.shiro.web.mgt.DefaultWebSubjectFactory;

public class StatelessDefaultSubjectFactory extends DefaultWebSubjectFactory {

    @Override
    public Subject createSubject(SubjectContext context) {
        context.setSessionCreationEnabled(false);
        return super.createSubject(context);
    }

}
