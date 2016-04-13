package com.klwork.business.domain.service;
import java.util.List;
import static org.junit.Assert.assertEquals;

import com.klwork.business.domain.model.TeamQuery;
import com.klwork.test.base.BaseSimpleTests;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.klwork.test.base.BaseTxTests;
import com.klwork.common.dao.QueryParameter;
import com.klwork.common.dto.vo.ViewPage;
import com.klwork.business.domain.model.Team;
import com.klwork.business.domain.repository.TeamRepository;
import com.klwork.business.domain.service.TeamService;

/**
 * 
 * @version 1.0
 * @created ${plugin.now}
 * @author ww
 */
 
public class TeamServiceTest extends BaseSimpleTests {
	@Autowired
	TeamService teamService;

	@Test
	public void testService() {
		Team team = new Team();
		//team.setDes("sdfsdfsdf");
		team.setName("ww");
		teamService.createTeam(team);
		System.out.println("sdfsdfsdfsf");
		TeamQuery query = TeamQuery.build().setName("ww");
		List<Team> list = teamService.findTeamByQueryCriteria(query,null);
		Assert.assertTrue(list.size() > 0);
	}
}
