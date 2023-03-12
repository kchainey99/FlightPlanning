# First3ShortestFlightPaths

Given a dense graph G that may or may not contain cycles, find the first n shortest paths based on either time or cost. Originally, the task was simply to find the shortest path based on time or cost, but the bonus problem was to find the first 3 shortest paths.

<ul>
  <li>Inputs: 2 txt files - graph info (FlightData.txt) &amp; requested flights(FlightPaths.txt)</li>
  <li>Output: txt file with the shortest path, alongside time & cost for taking that path (test.txt).</li>
</ul>
<h2>Classes</h2>
<ul>
  <li><strong>Main</strong> - class that creates a FightManager instance based off arguments & runs program</li>
  <li><strong>Graph</strong> - an interface holding methods that get implemented in the FlightMap</li>
  <li><strong>City</strong> - a vertex(AKA node) that is used for tracking whether or not that City has been visited on our FlightMap. These Cities also serve as the Key in the HashMap for the flight planner</li>
  <li><strong>Flight</strong> - Weighted Edges that will be added to the LinkedList within the FlightMap. It contains destination city for v in the (u,v) pair (since the source is the Key AKA City, it was excluded here); time and cost are the weights for the graph.</li>
  <li><strong>FlightMap</strong> - Weighted, Undirected Graph for storing flight data. It is undirected since we're assuming that there is a return leg for every flight between cities.</li>
  <li><strong>FlightManager</strong> - Reads in data from text files and runs shortest path algorithm</li>
