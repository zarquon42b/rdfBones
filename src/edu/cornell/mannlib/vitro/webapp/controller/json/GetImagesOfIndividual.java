/* $This file is distributed under the terms of the license in /doc/license.txt$ */

package edu.cornell.mannlib.vitro.webapp.controller.json;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import edu.cornell.mannlib.vitro.webapp.beans.Individual;
import edu.cornell.mannlib.vitro.webapp.controller.VitroRequest;
import edu.cornell.mannlib.vitro.webapp.dao.IndividualDao;
import edu.cornell.mannlib.vitro.webapp.services.shortview.ShortViewService;
import edu.cornell.mannlib.vitro.webapp.services.shortview.ShortViewService.ShortViewContext;
import edu.cornell.mannlib.vitro.webapp.services.shortview.ShortViewServiceSetup;
import edu.cornell.mannlib.vitro.webapp.web.templatemodels.individual.IndividualTemplateModel;

/**
 * Does a search for individuals, and uses the short view to render each of
 * the results.
 */
public class GetImagesOfIndividual extends GetSearchIndividualsByVClasses {
	private static final Log log = LogFactory
			.getLog(GetRenderedSearchIndividualsByVClass.class);

	protected GetImagesOfIndividual(VitroRequest vreq) {
		super(vreq);
	}

	/**
	 * Search for individuals by VClass or VClasses in the case of multiple parameters. The class URI(s) and the paging
	 * information are in the request parameters.
	 */
	@Override
	protected JSONObject process() throws Exception {
		
		
		JSONObject rObj = new JSONObject();
		
		rObj.put("shortViewHtml"," <img src=\"/vivo/file/n1363/thumbnail_P6250110.jpg\" width=\"90\" alt=\"Konkoly, David \"> <img src=\"/vivo/file/n6730/thumbnail_P6270160.jpg\" width=\"90\" alt=\"White, Bob \">");

		return rObj;
	}
}
