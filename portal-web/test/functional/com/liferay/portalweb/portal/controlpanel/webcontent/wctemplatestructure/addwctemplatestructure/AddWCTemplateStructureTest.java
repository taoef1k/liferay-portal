/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portalweb.portal.controlpanel.webcontent.wctemplatestructure.addwctemplatestructure;

import com.liferay.portalweb.portal.BaseTestCase;
import com.liferay.portalweb.portal.util.RuntimeVariables;

/**
 * @author Brian Wing Shun Chan
 */
public class AddWCTemplateStructureTest extends BaseTestCase {
	public void testAddWCTemplateStructure() throws Exception {
		int label = 1;

		while (label >= 1) {
			switch (label) {
			case 1:
				selenium.selectWindow("null");
				selenium.selectFrame("relative=top");
				selenium.open("/web/guest/home/");
				selenium.clickAt("//div[@id='dockbar']",
					RuntimeVariables.replace("Dockbar"));
				selenium.waitForElementPresent(
					"//script[contains(@src,'/aui/aui-editable/aui-editable-min.js')]");
				assertEquals(RuntimeVariables.replace("Go to"),
					selenium.getText("//li[@id='_145_mySites']/a/span"));
				selenium.mouseOver("//li[@id='_145_mySites']/a/span");
				selenium.waitForVisible("link=Control Panel");
				selenium.clickAt("link=Control Panel",
					RuntimeVariables.replace("Control Panel"));
				selenium.waitForPageToLoad("30000");
				selenium.clickAt("link=Web Content",
					RuntimeVariables.replace("Web Content"));
				selenium.waitForPageToLoad("30000");
				assertEquals(RuntimeVariables.replace("Manage"),
					selenium.getText("//span[@title='Manage']/ul/li/strong/a"));
				selenium.clickAt("//span[@title='Manage']/ul/li/strong/a",
					RuntimeVariables.replace("Manage"));
				selenium.waitForVisible(
					"//div[@class='lfr-component lfr-menu-list']/ul/li/a[contains(.,'Structures')]");
				assertEquals(RuntimeVariables.replace("Structures"),
					selenium.getText(
						"//div[@class='lfr-component lfr-menu-list']/ul/li/a[contains(.,'Structures')]"));
				selenium.clickAt("//div[@class='lfr-component lfr-menu-list']/ul/li/a[contains(.,'Structures')]",
					RuntimeVariables.replace("Structures"));
				selenium.waitForVisible("//iframe[contains(@src,'Structures')]");
				selenium.selectFrame("//iframe[contains(@src,'Structures')]");
				selenium.waitForElementPresent(
					"//script[contains(@src,'/liferay/store.js')]");
				Thread.sleep(1000);
				selenium.waitForVisible("//input[@name='_166_keywords']");
				selenium.type("//input[@name='_166_keywords']",
					RuntimeVariables.replace("WC Structure Name"));
				selenium.clickAt("//input[@value='Search']",
					RuntimeVariables.replace("Search"));
				selenium.waitForVisible(
					"//tr[contains(.,'WC Structure Name')]/td[3]/a");
				assertEquals(RuntimeVariables.replace("WC Structure Name"),
					selenium.getText(
						"//tr[contains(.,'WC Structure Name')]/td[3]/a"));
				selenium.clickAt("//tr[contains(.,'WC Structure Name')]/td[3]/a",
					RuntimeVariables.replace("WC Structure Name"));
				selenium.waitForPageToLoad("30000");
				Thread.sleep(5000);
				selenium.clickAt("//div[@class='aui-diagram-builder-drop-container']/div[2]",
					RuntimeVariables.replace("Edit Event"));
				selenium.waitForVisible(
					"//div[@class='aui-diagram-builder-drop-container']/div[2]/div[3]/span/span/button[@title='Edit']");
				selenium.clickAt("//div[@class='aui-diagram-builder-drop-container']/div[2]/div[3]/span/span/button[@title='Edit']",
					RuntimeVariables.replace("Edit Event"));
				assertEquals(RuntimeVariables.replace("Name"),
					selenium.getText(
						"//tbody[@class='yui3-datatable-data']/tr[5]/td[1]"));
				selenium.doubleClickAt("//tbody[@class='yui3-datatable-data']/tr[5]/td[2]",
					RuntimeVariables.replace("Name"));
				selenium.waitForVisible(
					"//form[contains(@class,'aui-textcelleditor-content')]/div/input");
				selenium.type("//form[contains(@class,'aui-textcelleditor-content')]/div/input",
					RuntimeVariables.replace("date"));
				selenium.clickAt("//button[@type='submit']",
					RuntimeVariables.replace("Save"));
				selenium.clickAt("//div[@class='aui-diagram-builder-drop-container']/div[3]",
					RuntimeVariables.replace("Edit Event"));
				selenium.waitForVisible(
					"//div[@class='aui-diagram-builder-drop-container']/div[3]/div[3]/span/span/button[@title='Edit']");
				selenium.clickAt("//div[@class='aui-diagram-builder-drop-container']/div[3]/div[3]/span/span/button[@title='Edit']",
					RuntimeVariables.replace("Edit Event"));
				assertEquals(RuntimeVariables.replace("Name"),
					selenium.getText(
						"//tbody[@class='yui3-datatable-data']/tr[5]/td[1]"));
				selenium.doubleClickAt("//tbody[@class='yui3-datatable-data']/tr[5]/td[2]",
					RuntimeVariables.replace("Name"));
				selenium.waitForVisible(
					"//form[contains(@class,'aui-textcelleditor-content')]/div/input");
				selenium.type("//form[contains(@class,'aui-textcelleditor-content')]/div/input",
					RuntimeVariables.replace("decimal"));
				selenium.clickAt("//button[@type='submit']",
					RuntimeVariables.replace("Save"));
				selenium.clickAt("//div[@class='aui-diagram-builder-drop-container']/div[6]",
					RuntimeVariables.replace("Edit Event"));
				selenium.waitForVisible(
					"//div[@class='aui-diagram-builder-drop-container']/div[6]/div[3]/span/span/button[@title='Edit']");
				selenium.clickAt("//div[@class='aui-diagram-builder-drop-container']/div[6]/div[3]/span/span/button[@title='Edit']",
					RuntimeVariables.replace("Edit Event"));
				assertEquals(RuntimeVariables.replace("Name"),
					selenium.getText(
						"//tbody[@class='yui3-datatable-data']/tr[5]/td[1]"));
				selenium.doubleClickAt("//tbody[@class='yui3-datatable-data']/tr[5]/td[2]",
					RuntimeVariables.replace("Name"));
				selenium.waitForVisible(
					"//form[contains(@class,'aui-textcelleditor-content')]/div/input");
				selenium.type("//form[contains(@class,'aui-textcelleditor-content')]/div/input",
					RuntimeVariables.replace("html"));
				selenium.clickAt("//button[@type='submit']",
					RuntimeVariables.replace("Save"));
				selenium.clickAt("//div[@class='aui-diagram-builder-drop-container']/div[7]",
					RuntimeVariables.replace("Edit Event"));
				selenium.waitForVisible(
					"//div[@class='aui-diagram-builder-drop-container']/div[7]/div[3]/span/span/button[@title='Edit']");
				selenium.clickAt("//div[@class='aui-diagram-builder-drop-container']/div[7]/div[3]/span/span/button[@title='Edit']",
					RuntimeVariables.replace("Edit Event"));
				assertEquals(RuntimeVariables.replace("Name"),
					selenium.getText(
						"//tbody[@class='yui3-datatable-data']/tr[5]/td[1]"));
				selenium.doubleClickAt("//tbody[@class='yui3-datatable-data']/tr[5]/td[2]",
					RuntimeVariables.replace("Name"));
				selenium.waitForVisible(
					"//form[contains(@class,'aui-textcelleditor-content')]/div/input");
				selenium.type("//form[contains(@class,'aui-textcelleditor-content')]/div/input",
					RuntimeVariables.replace("integer"));
				selenium.clickAt("//button[@type='submit']",
					RuntimeVariables.replace("Save"));
				selenium.clickAt("//div[@class='aui-diagram-builder-drop-container']/div[9]",
					RuntimeVariables.replace("Edit Event"));
				selenium.waitForVisible(
					"//div[@class='aui-diagram-builder-drop-container']/div[9]/div[3]/span/span/button[@title='Edit']");
				selenium.clickAt("//div[@class='aui-diagram-builder-drop-container']/div[9]/div[3]/span/span/button[@title='Edit']",
					RuntimeVariables.replace("Edit Event"));
				assertEquals(RuntimeVariables.replace("Name"),
					selenium.getText(
						"//tbody[@class='yui3-datatable-data']/tr[5]/td[1]"));
				selenium.doubleClickAt("//tbody[@class='yui3-datatable-data']/tr[5]/td[2]",
					RuntimeVariables.replace("Name"));
				selenium.waitForVisible(
					"//form[contains(@class,'aui-textcelleditor-content')]/div/input");
				selenium.type("//form[contains(@class,'aui-textcelleditor-content')]/div/input",
					RuntimeVariables.replace("number"));
				selenium.clickAt("//button[@type='submit']",
					RuntimeVariables.replace("Save"));
				selenium.clickAt("//div[@class='aui-diagram-builder-drop-container']/div[12]",
					RuntimeVariables.replace("Edit Event"));
				selenium.waitForVisible(
					"//div[@class='aui-diagram-builder-drop-container']/div[12]/div[3]/span/span/button[@title='Edit']");
				selenium.clickAt("//div[@class='aui-diagram-builder-drop-container']/div[12]/div[3]/span/span/button[@title='Edit']",
					RuntimeVariables.replace("Edit Event"));
				assertEquals(RuntimeVariables.replace("Name"),
					selenium.getText(
						"//tbody[@class='yui3-datatable-data']/tr[5]/td[1]"));
				selenium.doubleClickAt("//tbody[@class='yui3-datatable-data']/tr[5]/td[2]",
					RuntimeVariables.replace("Name"));
				selenium.waitForVisible(
					"//form[contains(@class,'aui-textcelleditor-content')]/div/input");
				selenium.type("//form[contains(@class,'aui-textcelleditor-content')]/div/input",
					RuntimeVariables.replace("text"));
				selenium.clickAt("//button[@type='submit']",
					RuntimeVariables.replace("Save"));
				selenium.clickAt("//div[@class='aui-diagram-builder-drop-container']/div[13]",
					RuntimeVariables.replace("Edit Event"));
				selenium.waitForVisible(
					"//div[@class='aui-diagram-builder-drop-container']/div[13]/div[3]/span/span/button[@title='Edit']");
				selenium.clickAt("//div[@class='aui-diagram-builder-drop-container']/div[13]/div[3]/span/span/button[@title='Edit']",
					RuntimeVariables.replace("Edit Event"));
				assertEquals(RuntimeVariables.replace("Name"),
					selenium.getText(
						"//tbody[@class='yui3-datatable-data']/tr[5]/td[1]"));
				selenium.doubleClickAt("//tbody[@class='yui3-datatable-data']/tr[5]/td[2]",
					RuntimeVariables.replace("Name"));
				selenium.waitForVisible(
					"//form[contains(@class,'aui-textcelleditor-content')]/div/input");
				selenium.type("//form[contains(@class,'aui-textcelleditor-content')]/div/input",
					RuntimeVariables.replace("textbox"));
				selenium.clickAt("//button[@type='submit']",
					RuntimeVariables.replace("Save"));
				selenium.clickAt("//input[@value='Save']",
					RuntimeVariables.replace("Save"));
				selenium.waitForPageToLoad("30000");
				selenium.selectFrame("relative=top");
				selenium.open("/web/guest/home/");
				selenium.clickAt("//div[@id='dockbar']",
					RuntimeVariables.replace("Dockbar"));
				selenium.waitForElementPresent(
					"//script[contains(@src,'/aui/aui-editable/aui-editable-min.js')]");
				assertEquals(RuntimeVariables.replace("Go to"),
					selenium.getText("//li[@id='_145_mySites']/a/span"));
				selenium.mouseOver("//li[@id='_145_mySites']/a/span");
				selenium.waitForVisible("link=Control Panel");
				selenium.clickAt("link=Control Panel",
					RuntimeVariables.replace("Control Panel"));
				selenium.waitForPageToLoad("30000");
				selenium.clickAt("link=Web Content",
					RuntimeVariables.replace("Web Content"));
				selenium.waitForPageToLoad("30000");
				assertEquals(RuntimeVariables.replace("Manage"),
					selenium.getText("//span[@title='Manage']/ul/li/strong/a"));
				selenium.clickAt("//span[@title='Manage']/ul/li/strong/a",
					RuntimeVariables.replace("Manage"));
				selenium.waitForVisible(
					"//div[@class='lfr-component lfr-menu-list']/ul/li/a[contains(.,'Structures')]");
				assertEquals(RuntimeVariables.replace("Structures"),
					selenium.getText(
						"//div[@class='lfr-component lfr-menu-list']/ul/li/a[contains(.,'Structures')]"));
				selenium.clickAt("//div[@class='lfr-component lfr-menu-list']/ul/li/a[contains(.,'Structures')]",
					RuntimeVariables.replace("Structures"));
				selenium.waitForVisible("//iframe[contains(@src,'Structures')]");
				selenium.selectFrame("//iframe[contains(@src,'Structures')]");
				selenium.waitForElementPresent(
					"//script[contains(@src,'/liferay/store.js')]");
				Thread.sleep(1000);
				selenium.waitForVisible("//input[@name='_166_keywords']");
				selenium.type("//input[@name='_166_keywords']",
					RuntimeVariables.replace("WC Structure Name"));
				selenium.clickAt("//input[@value='Search']",
					RuntimeVariables.replace("Search"));
				selenium.waitForVisible(
					"//tr[contains(.,'WC Structure Name')]/td[3]/a");
				assertEquals(RuntimeVariables.replace("WC Structure Name"),
					selenium.getText(
						"//tr[contains(.,'WC Structure Name')]/td[3]/a"));
				assertEquals(RuntimeVariables.replace("Actions"),
					selenium.getText(
						"//tr[contains(.,'WC Structure Name')]/td[5]/span/ul/li/strong/a"));
				selenium.clickAt("//tr[contains(.,'WC Structure Name')]/td[5]/span/ul/li/strong/a",
					RuntimeVariables.replace("Actions"));
				selenium.waitForVisible(
					"//div[@class='lfr-component lfr-menu-list']/ul/li/a[contains(.,'Manage Templates')]");
				assertEquals(RuntimeVariables.replace("Manage Templates"),
					selenium.getText(
						"//div[@class='lfr-component lfr-menu-list']/ul/li/a[contains(.,'Manage Templates')]"));
				selenium.clickAt("//div[@class='lfr-component lfr-menu-list']/ul/li/a[contains(.,'Manage Templates')]",
					RuntimeVariables.replace("Manage Templates"));
				selenium.waitForPageToLoad("30000");
				assertEquals(RuntimeVariables.replace("Add"),
					selenium.getText(
						"//span[@class='lfr-toolbar-button add-template ']/a"));
				selenium.clickAt("//span[@class='lfr-toolbar-button add-template ']/a",
					RuntimeVariables.replace("Add"));
				selenium.waitForPageToLoad("30000");
				Thread.sleep(5000);
				selenium.waitForVisible("//input[@id='_166_name_en_US']");
				selenium.type("//input[@id='_166_name_en_US']",
					RuntimeVariables.replace("WC Template Structure Name"));
				selenium.type("//textarea[@id='_166_description_en_US']",
					RuntimeVariables.replace(
						"WC Template Structure Description"));

				boolean plainEditorNotVisible = selenium.isVisible(
						"//textarea[@id='_166_plainEditorField']");

				if (plainEditorNotVisible) {
					label = 2;

					continue;
				}

				selenium.select("//select[@id='_166_editorType']",
					RuntimeVariables.replace("Plain"));

			case 2:
				assertEquals("Plain",
					selenium.getSelectedLabel("//select[@id='_166_editorType']"));
				selenium.type("//textarea[@id='_166_plainEditorField']",
					RuntimeVariables.replace(
						"<p>$date.getData()</p><p>$decimal.getData()</p><p>$html.getData()</p><p>$integer.getData()</p><p>$number.getData()</p><p>$text.getData()</p><p>$textbox.getData()</p>"));
				selenium.clickAt("//input[@value='Save']",
					RuntimeVariables.replace("Save"));
				selenium.waitForPageToLoad("30000");
				assertEquals(RuntimeVariables.replace(
						"Your request completed successfully."),
					selenium.getText("//div[@class='portlet-msg-success']"));
				assertEquals(RuntimeVariables.replace(
						"WC Template Structure Name"),
					selenium.getText(
						"//tr[contains(.,'WC Template Structure Name')]/td[3]/a"));
				selenium.selectFrame("relative=top");

			case 100:
				label = -1;
			}
		}
	}
}