/***********           LICENSE HEADER   *******************************
JAUS Tool Set
Copyright (c)  2010, United States Government
All rights reserved.

Redistribution and use in source and binary forms, with or without 
modification, are permitted provided that the following conditions are met:

       Redistributions of source code must retain the above copyright notice, 
this list of conditions and the following disclaimer.

       Redistributions in binary form must reproduce the above copyright 
notice, this list of conditions and the following disclaimer in the 
documentation and/or other materials provided with the distribution.

       Neither the name of the United States Government nor the names of 
its contributors may be used to endorse or promote products derived from 
this software without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" 
AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE 
IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE 
ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE 
LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR 
CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF 
SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS 
INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN 
CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
POSSIBILITY OF SUCH DAMAGE.
*********************  END OF LICENSE ***********************************/

package org.jts.validator;

import org.junit.*;
import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.SchemaFactory;

public class ListTest
{
	private JAXBContext jc;
	private Unmarshaller unmarshaller;

	@Before
	public void createUnmarshaller()
	{
		try
		{
			jc = JAXBContext.newInstance("org.jts.jsidl.binding");
			unmarshaller = jc.createUnmarshaller();
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}

	@Test
	public void testValidList1() throws Exception
	{
		unmarshaller.setSchema(SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema").newSchema(new File("resources/schema/JSIDL_Plus/jsidl_plus.xsd")));
		org.jts.jsidl.binding.List list;
		list = (org.jts.jsidl.binding.List)unmarshaller.unmarshal(new File("test/org/jts/validator/JSIDL/Valid/List1.xml"));
		org.jts.validator.List.validate(list);
	}

	@Test(expected = ValidatorException.class)
	public void testInvalidList1()
	{
		try
		{
			org.jts.jsidl.binding.List list;
			list = (org.jts.jsidl.binding.List)unmarshaller.unmarshal(new File("test/org/jts/validator/JSIDL/Invalid/List1.xml"));
			org.jts.validator.List.validate(list);
		}
		catch(JAXBException e)
		{
			System.out.print(e);
		}
	}
	
	@Test
	public void testValidList2() throws Exception
	{
		unmarshaller.setSchema(SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema").newSchema(new File("resources/schema/JSIDL_Plus/jsidl_plus.xsd")));
		org.jts.jsidl.binding.List list;
		list = (org.jts.jsidl.binding.List)unmarshaller.unmarshal(new File("test/org/jts/validator/JSIDL/Valid/List2.xml"));
		org.jts.validator.List.validate(list);
	}

	@Test(expected = ValidatorException.class)
	public void testInvalidList2()
	{
		try
		{
			org.jts.jsidl.binding.List list;
			list = (org.jts.jsidl.binding.List)unmarshaller.unmarshal(new File("test/org/jts/validator/JSIDL/Invalid/List2.xml"));
			org.jts.validator.List.validate(list);
		}
		catch(JAXBException e)
		{
			System.out.print(e);
		}
	}
	
	@Test
	public void testValidList3() throws Exception
	{
		unmarshaller.setSchema(SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema").newSchema(new File("resources/schema/JSIDL_Plus/jsidl_plus.xsd")));
		org.jts.jsidl.binding.List list;
		list = (org.jts.jsidl.binding.List)unmarshaller.unmarshal(new File("test/org/jts/validator/JSIDL/Valid/List3.xml"));
		org.jts.validator.List.validate(list);
	}

	@Test(expected = ValidatorException.class)
	public void testInvalidList3()
	{
		try
		{
			org.jts.jsidl.binding.List list;
			list = (org.jts.jsidl.binding.List)unmarshaller.unmarshal(new File("test/org/jts/validator/JSIDL/Invalid/List3.xml"));
			org.jts.validator.List.validate(list);
		}
		catch(JAXBException e)
		{
			System.out.print(e);
		}
	}
	
	@Test
	public void testValidList4() throws Exception
	{
		unmarshaller.setSchema(SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema").newSchema(new File("resources/schema/JSIDL_Plus/jsidl_plus.xsd")));
		org.jts.jsidl.binding.List list;
		list = (org.jts.jsidl.binding.List)unmarshaller.unmarshal(new File("test/org/jts/validator/JSIDL/Valid/List4.xml"));
		org.jts.validator.List.validate(list);
	}

	@Test(expected = ValidatorException.class)
	public void testInvalidList4()
	{
		try
		{
			org.jts.jsidl.binding.List list;
			list = (org.jts.jsidl.binding.List)unmarshaller.unmarshal(new File("test/org/jts/validator/JSIDL/Invalid/List4.xml"));
			org.jts.validator.List.validate(list);
		}
		catch(JAXBException e)
		{
			System.out.print(e);
		}
	}

}
