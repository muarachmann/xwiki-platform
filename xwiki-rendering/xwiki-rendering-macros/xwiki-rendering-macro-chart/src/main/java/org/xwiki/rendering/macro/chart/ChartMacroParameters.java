/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.xwiki.rendering.macro.chart;

import java.util.HashMap;
import java.util.Map;

import org.xwiki.chart.ChartGenerator;
import org.xwiki.rendering.macro.descriptor.annotation.ParameterDescription;
import org.xwiki.rendering.macro.descriptor.annotation.ParameterMandatory;

/**
 * Parameters for chart macro.
 * 
 * @version $Id: $
 * @since 2.0M1
 */
public class ChartMacroParameters
{
    /**
     * @see ChartMacroParameters#getTitle()
     */
    private String title;
    
    /**
     * @see ChartMacroParameters#getHeight()
     */
    private int height = 300;
    
    /**
     * @see ChartMacroParameters#getWidth()
     */
    private int width = 400;
    
    /**
     * @see ChartMacroParameters#getType()
     */
    private String type;

    /**
     * @see ChartMacroParameters#getSource()
     */
    private String source = "xdom";
    
    /**
     * @see ChartMacroParameters#getParams()
     */
    private String params;
    
    /**
     * @return The title of the chart.
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * @param title - refer to {@link #getTitle()}.
     */
    @ParameterDescription("The title of the chart.")
    public void setTitle(String title)
    {
        this.title = title;
    }

    /**
     * @return The width of the chart.
     */
    public int getWidth()
    {
        return width;
    }

    /**
     * @param width - refer to {@link #getWidth()}.
     */
    @ParameterDescription("The width of the chart.")
    public void setWidth(int width)
    {
        this.width = width;
    }

    /**
     * @return The height of the chart.
     */
    public int getHeight()
    {
        return height;
    }

    /**
     * @param height - refer to {@link #getHeight()}.
     */
    @ParameterDescription("The height of the chart.")
    public void setHeight(int height)
    {
        this.height = height;
    }
    
    /**
     * @return the type of the chart.
     */
    public String getType()
    {
        return type;
    }

    /**
     * @param chartType - refer to {@link #getType()}.
     */
    @ParameterMandatory
    @ParameterDescription("The type of the chart.")
    public void setType(String chartType)
    {
        this.type = chartType;
    }

    /**
     * @return a string describing the data source
     */
    public String getSource()
    {
        return source;
    }

    /**
     * @param source - refer to {@link #getSource()
     */
    @ParameterDescription("The string describing the data source.")
    public void setSource(String source)
    {
        this.source = source;
    }
        
    /**
     * @return Additional parameters for the data source.
     */
    public String getParams()
    {
        return params;
    }

    /**
     * @param params Additional parameters for the data source.
     */
    @ParameterDescription("Additional parameters for the datasource.")
    public void setParams(String params)
    {
        this.params = params;
    }

    /**
     * @return a Map containing all the parameters.
     */
    public Map<String, String> getParametersMap()
    {
        Map<String, String> map = new HashMap<String, String>();
        map.put(ChartGenerator.TITLE_PARAM, getTitle());
        map.put(ChartGenerator.WIDTH_PARAM, String.valueOf(getWidth()));
        map.put(ChartGenerator.HEIGHT_PARAM, String.valueOf(getHeight()));
        map.put(ChartGenerator.TYPE_PARAM, getType());
        map.put(ChartDataSource.SOURCE, getSource());
        map.put(ChartDataSource.PARAMS, getParams());        
        return map;
    }
}
